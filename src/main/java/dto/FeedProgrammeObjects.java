/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;




import javax.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement

public class FeedProgrammeObjects {
	
    
    
	private String pid;
        private String name;
       
        
        

	
	public String getpid() {
		return pid;
	}
	
	public void setpid(String pid) {
		this.pid= pid;
	}
        
        public String getname() {
		return name;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
	
	
	
}
