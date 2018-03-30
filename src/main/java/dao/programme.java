/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.FeedProgrammeObjects;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author dell
 */
public class programme {
        public  ArrayList<FeedProgrammeObjects>  GetFeed(Connection connection  ) throws Exception
	{
		ArrayList<FeedProgrammeObjects> feedData = new ArrayList<FeedProgrammeObjects>();
               
                
                
		try 
		{
			PreparedStatement ps = connection.prepareStatement("SELECT PID , NAME from programme " );
			ResultSet rs = ps.executeQuery();
                        int got =0;
			while(rs.next())
			{
			
                                FeedProgrammeObjects feedObject = new FeedProgrammeObjects();  
                                feedObject.setpid(rs.getString("PID"));
                                feedObject.setname(rs.getString("NAME"));
                                
                                feedData.add(feedObject);
                      
                        }
                        
                       
		}
		catch(Exception e)
		{
			throw e;
		}
                
                return feedData;
}
        
}
