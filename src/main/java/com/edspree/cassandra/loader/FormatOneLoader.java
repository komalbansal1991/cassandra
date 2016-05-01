package com.edspree.cassandra.loader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.edspree.cassandra.client.SimpleClient;
import com.edspree.cassandra.objects.FormatOne;
import com.edspree.cassandra.objects.FormatOneCourse;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FormatOneLoader {
        
    private static final String DB = "matriculla";
    private static final String TABLE = "institutes";
    
    private static FormatOne createObjFromJson(String jsonStr) throws JsonParseException, JsonMappingException, IOException{
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(jsonStr, FormatOne.class);
    }
    
    private static String createInstiInsertStmt(FormatOne obj, String contactNum){
        return "insert into " + DB + "." + TABLE + "(institute_id,name,location,other_branches,website_url,contact_num,avg_teacher_exp,avg_batch_size,avg_fees,num_of_students,discount) values ('" + obj.getName()+" 1','" + obj.getName() + "',{town:'',city:'Delhi',state:'Delhi',country:'India',pin:'',plot_street:'" +
                obj.getAddress() + "'}," + toBoolean(obj.getOtherBranches()) + ",'" + obj.getWebsiteUrl() + "',{'':'" + contactNum + "'},'" + obj.getAvgTeacherExp() + "'," + obj.getAvgBatchSize() + ",{'avg_fees':" + obj.getInstiFeesMin() + "}," + obj.getNumStudents() + ",'" + obj.getDiscount() +"')";
    } 
    
    private static String toBoolean(String otherBranches) {
        if(otherBranches.equalsIgnoreCase("yes")) {
            return "true";
        }
        return "false";
    }

    private static void loadDataToCassandra(SimpleClient client, String file, String contactFile){
        try{
            BufferedReader br1 = new BufferedReader(new FileReader(file));
            BufferedReader br2 = new BufferedReader(new FileReader(contactFile));
            String line, contact;
            while((line = br1.readLine()) != null && (contact = br2.readLine())!=null) {
                FormatOne obj = createObjFromJson(line);
               
                client.execute(createInstiInsertStmt(obj,contact));
                int i = 0;
                for(FormatOneCourse course : obj.getCourses()){
                    client.execute(createBatchInsertStmt(course,obj.getName(),i));
                    i++;
                }
            }
            br1.close(); 
            br2.close();
        }
        catch(Exception ex){
            System.out.println(ex.toString());
        }
    }
    
    private static String createBatchInsertStmt(FormatOneCourse course, String name, int i) {
        return "insert into " + DB + "." + TABLE + "(institute_id,batch_id,board,subject,class) values('" + name + " 1','" + i + "','" + course.getBoard() +"','" + course.getSubject() +"','" + course.getCourse() + "')";
    }

    public static void main(String args[]) {
        String filePath = args[0];
        String contactFile = args[1];
        String nodeIp = args[2];
        SimpleClient client = new SimpleClient(nodeIp);
        loadDataToCassandra(client, filePath, contactFile);
        client.close();
    }
}
