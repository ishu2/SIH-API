/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

import com.google.gson.Gson;
import dto.FeedProgrammeObjects;
import dto.FeedschemeObjects;
import java.util.ArrayList;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import model.programmeManager;
import model.schememanager;

/**
 *
 * @author dell
 */
@Path("programmee")
public class displayprogramme {
  @GET
	
      @Produces("application/json")
      
      public String data(  )
      { 
           ArrayList<FeedProgrammeObjects> feedData = new ArrayList<FeedProgrammeObjects>();
           String feeds = null;
          try{
              
          programmeManager projectManager= new programmeManager();
          feedData = projectManager.GetFeeds();
          Gson gson = new Gson();
	  System.out.println(gson.toJson(feedData));
	  feeds = gson.toJson(feedData);
       
           }
      catch (Exception e)
		{
			System.out.println("error");
		}
          
          return feeds;
      }
      
      
      
      @GET
	
      @Produces("application/json")
      @Path("/{programmeId}")
      
      public String scheme( @PathParam("programmeId") String  programmeId  )
      { 
           ArrayList<FeedschemeObjects> feedData = new ArrayList<FeedschemeObjects>();
           String feeds = null;
          try{
              
          schememanager projectManager= new schememanager();
          feedData = projectManager.GetFeeds(programmeId);
          Gson gson = new Gson();
	  System.out.println(gson.toJson(feedData));
	  feeds = gson.toJson(feedData);
       
           }
      catch (Exception e)
		{
			System.out.println("error");
		}
          
          return feeds;
      }
      
      
       
}
