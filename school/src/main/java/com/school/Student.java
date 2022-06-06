package com.school;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class Student implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6932283542105394610L;
	private String name;
	private int roll;
	
	private List<String> nameList;
	
	@PostConstruct
	public void init() {
		show();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public List<String> getNameList() {
		return nameList;
	}

	public void setNameList(List<String> nameList) {
		this.nameList = nameList;
	}
	

	public void show() {
		nameList =new ArrayList<String>();
		nameList.add("Kousik Mondal");
		nameList.add("Sabyasachi Ghosh");
		nameList.add("Amit Ghosh");
		
		
	}
   
}