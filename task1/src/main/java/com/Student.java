package com;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Student {
	
	private String name;
	private int roll;
	
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
	
	public void show() {
		if(name=="Kousik") {
		System.out.println("Name : "+name+" ,Roll : 01 ");
		}
		else if(name=="Sabyasachi") {
			System.out.println("Name : "+name+" ,Roll : 02 ");
			}
	}

}
