package model;


import dao.Database;
import dao.scheme;
import dto.FeedschemeObjects;
import java.sql.Connection;
import java.util.ArrayList;

public class schememanager {
	
	
	public ArrayList<FeedschemeObjects>  GetFeeds(String programmeId)throws Exception {
            
          ArrayList<FeedschemeObjects> feedData = null;
               
		try {
			   Database database= new Database();
			   Connection connection = database.Get_Connection();
                           scheme project= new scheme();
			   feedData =project.GetFeed(connection , programmeId );
                           
                           
                               
		
		} catch (Exception e) {
			throw e;
		}
		return feedData;
	}

}
