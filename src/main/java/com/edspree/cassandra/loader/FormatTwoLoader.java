package com.edspree.cassandra.loader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.edspree.cassandra.client.SimpleClient;
import com.edspree.cassandra.objects.FormatTwo;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FormatTwoLoader {
    private static final String DB = "matriculla";
    private static final String TABLE = "institutes";

    private static FormatTwo createObjFromJson(String jsonStr) throws JsonParseException, JsonMappingException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(jsonStr, FormatTwo.class);
    }

    private static String createInsertStmt(FormatTwo obj){
        return "insert into " + DB + "." + TABLE + "(institute_id,name,contact_num) values('" + obj.getName() + " 1','" + obj.getName() + "',{'':'" + 
                getContacts(obj) + "'})";
        		    }    
    
    private static String getContacts(FormatTwo obj) {
       StringBuilder contact = new StringBuilder();
       if(obj.getContact1() != null){
           contact.append(obj.getContact1()+",");
       }
       if(obj.getContact2() != null){
           contact.append(obj.getContact2()+",");
       }
       if(obj.getContact3() != null){
           contact.append(obj.getContact3()+",");
       }
       if(obj.getContact4() != null){
           contact.append(obj.getContact4()+",");
       }
       if(obj.getContact5() != null){
           contact.append(obj.getContact5()+",");
       }
       return contact.toString();
    }

    private static void loadDataToCassandra(SimpleClient client, String file) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                client.execute(createInsertStmt(createObjFromJson(line)));
            }
            br.close();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    public static void main(String args[]) {
        String filePath = args[0];
        String nodeIp = args[1];
        SimpleClient client = new SimpleClient(nodeIp);
        loadDataToCassandra(client, filePath);
        client.close();
    }
}
