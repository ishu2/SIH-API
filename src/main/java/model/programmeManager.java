/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dao.Database;
import dao.programme;
import dto.FeedProgrammeObjects;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author dell
 */
public class programmeManager {
    public ArrayList<FeedProgrammeObjects>  GetFeeds()throws Exception {
            
          ArrayList<FeedProgrammeObjects> feedData = null;
               
		try {
			   Database database= new Database();
			   Connection connection = database.Get_Connection();
                           programme project= new programme();
			   feedData =project.GetFeed(connection);
                           
                           
                               
		
		} catch (Exception e) {
			throw e;
		}
		return feedData;
	}
}
