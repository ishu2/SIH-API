package dao;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import dto.FeedObjects;
import dto.FeedschemeObjects;


public class scheme {
	
	
	
        
        public  ArrayList<FeedschemeObjects>  GetFeed(Connection connection , String programmeId  ) throws Exception
	{
		ArrayList<FeedschemeObjects> feedData = new ArrayList<FeedschemeObjects>();
                 
		try 
		{
			PreparedStatement ps = connection.prepareStatement("SELECT SID from programme_scheme where PID=   "+programmeId+" " );
			ResultSet rs = ps.executeQuery();

			while(rs.next())
			{
				
                                
                                FeedschemeObjects feedObject = new FeedschemeObjects();
                                String sid= rs.getString("SID");
                               
                                
                        PreparedStatement ps1 = connection.prepareStatement("SELECT  * from scheme where SID="+sid+" " );      
                         ResultSet rs1 = ps1.executeQuery(); 
                         while(rs1.next()){
                             feedObject.setname(rs1.getString("NAME"));
                             feedObject.setdescription(rs1.getString("DESCRIPTION"));
                             feedObject.setcategory(rs1.getString("CATEGORY"));
                           
                               
                            feedData.add(feedObject);
                         }            
                                                                     
				
			}
                         
                }

		catch(Exception e)
		{
			throw e;
		}
                
                return feedData;
	
	
}
        
}
