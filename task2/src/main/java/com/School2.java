package com;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class School2 {
	
	//private int roll;
	private String name;
	List<String>nameoption;
	
	
	@PostConstruct
	public void all() {
		nameoption= new ArrayList();
		nameoption.add("Kousik");
		nameoption.add("Ajarul");
		nameoption.add("Tarun");
		nameoption.add("Pranab");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getNameoption() {
		return nameoption;
	}
	
	public void show() {
	
		  switch(name){ 
		  case "Kousik":
			  System.out.println("Name: Kousik , Roll: 01");
			  break; 
			  
		  case "Ajarul":
			  System.out.println("Name: Ajarul , Roll: 02");
			  break; 
		  case "Tarun":
			  System.out.println("Name: Tarun , Roll: 03");
			  break; 
		  case "Pranab":
			  System.out.println("Name: Pranab , Roll: 04");
			  break; 
			  
			  
		  }
		
		
	}
}
