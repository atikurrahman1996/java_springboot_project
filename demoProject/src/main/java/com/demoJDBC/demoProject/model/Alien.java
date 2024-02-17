package com.demoJDBC.demoProject.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component                      // @componet will create & manage object for us // Scope("Prototype") will create new bean for every new request
@Scope("prototype")
public class Alien {
	
	// declare variable 
	
	private int id;
	private String name;
	private String tech;
	
	
	// getter & setters method> right click > source > select generate setter & getters method
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getTech() {
		return tech;
	}
	
	public void setTech(String tech) {
		this.tech = tech;
	}

	
	  // toString Method to print the result > right click > source > select toString
	
	@Override
	public String toString() {
		return "Alien [id=" + id + ", name=" + name + ", tech=" + tech + "]";
	}	

}


