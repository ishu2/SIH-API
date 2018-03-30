package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import dto.FeedObjects;


public class Project {
	
	
	/*public  ArrayList<FeedObjects>  GetAllFeed(Connection connection) throws Exception
	{
		ArrayList<FeedObjects> feedData = new ArrayList<FeedObjects>();
                String feeds=null;
                String pass = "02301032014";
                String db_pass = null;
		try 
		{
			PreparedStatement ps = connection.prepareStatement("SELECT eno, s_no from login   " );
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				//FeedObjects feedObject = new FeedObjects();
				//feedObject.setname(rs.getString("eno"));
                                //feedObject.setno(rs.getInt("s_no"));
                                feedData.add(feedObject);
                                
				
			}
                        
                       
		}
		catch(Exception e)
		{
			throw e;
		}
                
                return feedData;
	}*/
        
        public  ArrayList<FeedObjects>  GetFeed(Connection connection , String userId , String userpass ) throws Exception
	{
		ArrayList<FeedObjects> feedData = new ArrayList<FeedObjects>();
               
                
                
		try 
		{
			PreparedStatement ps = connection.prepareStatement("SELECT pass,designation from login where userid='"+userId+"'" );
			ResultSet rs = ps.executeQuery();
                       
			while(rs.next())
			{
				
                                
                                FeedObjects feedObject = new FeedObjects();
                                String actualpass= rs.getString("pass");
                                
                                if(userpass.equals(actualpass)){
                                   
                                    feedObject.setans("yes");
                                    feedObject.setdesignation(rs.getString("designation"));
                                    feedData.add(feedObject);
                                    
                                }else{
                                    feedObject.setans("no");
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
