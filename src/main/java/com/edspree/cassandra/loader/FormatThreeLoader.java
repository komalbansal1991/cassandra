package com.edspree.cassandra.loader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.edspree.cassandra.client.SimpleClient;
import com.edspree.cassandra.objects.FormatThree;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FormatThreeLoader {
    private static final String DB = "matriculla";
    private static final String TABLE = "institutes";

    private static FormatThree createObjFromJson(String jsonStr) throws JsonParseException, JsonMappingException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(jsonStr, FormatThree.class);
    }

    private static String createInsertStmt(FormatThree obj) {
        return "insert into " + DB + "." + TABLE + "(institute_id,name,location) values('" + obj.getName() + " 1','" + obj.getName()
                + "',{town:'',city:'Delhi',state:'Delhi',country:'India',pin:'',plot_street:'" +
                obj.getAddress() + "'})";
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
