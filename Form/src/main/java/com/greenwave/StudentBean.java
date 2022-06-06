package com.greenwave;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.convert.ConverterException;


@ManagedBean
@SessionScoped
public class StudentBean {
	private String name;
	private String gender;
	private int cls;
	private int roll;
	private List<Student> studentList = new ArrayList<Student>();
	
	private List<Integer> clslist = new ArrayList<Integer>();

	//just chek	
	private List<Integer> clsList = new ArrayList<Integer>();
	private List<Integer> rollList = new ArrayList<Integer>();
	
	//private Set<Integer> k=new LinkedHashSet<Integer>();
	
	@PostConstruct
	public void init() {
		clslist.add(1);
		clslist.add(2);
		clslist.add(3);
		clslist.add(4);
		clslist.add(5);
	}
	public String submit() {
		
				
		/*for(int i=0 ; i<studentList.size(); i++) {
			if(cls==studentList.contains(cls)) {
				if(roll==roll) {
					System.out.println("not add");
				}
				else {
					studentList.add(new Student(name,gender,cls,roll));
				
			}
		}else {
		studentList.add(new Student(name,gender,cls,roll));
		}
		}*/
//		for(int i=0 ; i<studentList.size(); i++) {
//			
//			clsList.add(cls);
//			rollList.add(roll);
//		}
		/*for(int j=0 ; j<clsList.size() ; j++) {
			if(cls==clsList.get(j)) {
				for(int z=0 ; z<rollList.size() ; z++) {
					if(roll==rollList.get(z)) {
						System.out.println("not add");
					}
				}
				//System.out.println("not add");
			}
		}*/
//		for(int k=0; k<clsList.size();k++) {
//		System.out.println("add "+clsList.get(k));
//		}
		/*for(int j=0 ; j<clsList.size() ; j++) {
			if(cls==clsList.get(j)) {
				for(int z=0 ; z<rollList.size() ; z++) {
					if(roll==rollList.get(z)) {
						System.out.println("not add");
					}
					}
				}
		}*/
		try {
		for(int j=0 ; j<clsList.size() ; j++) {
			if(cls==clsList.get(j)) {
			for(int z=0 ; z<rollList.size() ; z++) {
				
						if(roll==rollList.get(z)) {
					System.out.println("already registerd class : "+cls+" roll : "+roll);
					 throw new Exception("This student is already registerd");
					}
						
						
				}
				
							}
			
			}
		clsList.add(cls);
		rollList.add(roll);
		studentList.add(new Student(name,gender,cls,roll));
		
		
		}catch (Exception e) {
//			FacesMessage msg = new FacesMessage(e.getMessage());
//			 
//			 msg.setSeverity(FacesMessage.SEVERITY_ERROR );  
//			 
//	         throw new ConverterException(msg);
			System.out.println(e);
		}
		
		
		
		return null;
			
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getCls() {
		return cls;
	}
	public void setCls(int cls) {
		this.cls = cls;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	
	public List<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	public List<Integer> getClslist() {
		return clslist;
	}
	
	
	
	

}