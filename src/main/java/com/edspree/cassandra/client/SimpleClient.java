package com.edspree.cassandra.client;


import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Host;
import com.datastax.driver.core.Metadata;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Session;

public class SimpleClient {
   private Cluster cluster;
   private Session session;
   
   public SimpleClient(String nodeIp) {
       this.connect(nodeIp);
   }

   public void connect(String nodeIp) {
      cluster = Cluster.builder()
            .addContactPoint(nodeIp).build();
      Metadata metadata = cluster.getMetadata();
      System.out.printf("Connected to cluster: %s\n", 
            metadata.getClusterName());
      for ( Host host : metadata.getAllHosts() ) {
         System.out.printf("Datatacenter: %s; Host: %s; Rack: %s\n",
               host.getDatacenter(), host.getAddress(), host.getRack());
      }
   }

   public ResultSet execute(String cql){
       session = cluster.connect();
       ResultSet rs = session.execute(cql);
       session.close();
       return rs;
   }
   
   public void close() {
      cluster.close();
   }
}