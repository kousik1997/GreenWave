package com.greenwave;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

import com.greenwave.Student.Submarks;



@ManagedBean
@ViewScoped
public class StudentBean  {

	private String name;
	private int cls;
	private int roll;
	private String address;
	
	private int index;

	private String subject;
	private int marks;
	
	private Student student;


	private List<Student> studentList = new ArrayList<Student>();
	private List<Submarks> markList = new ArrayList<Submarks>();




	public void add() {

		Student tempStudent = new Student(name,cls,roll,address);
		studentList.add(tempStudent);

	}
	public String onMarksAdd() {
		//System.out.println("StudentBean.onMarksAdd()");
		markList.add(new Submarks(subject, marks));
		return null;
	}


	public String submit() {

		Student stu = new Student(name, cls, roll, address);
		stu.getMarkList().addAll(markList);
		studentList.add(stu);
		markList.clear();
		return null;

	}
	
	public void view(ActionEvent event) {
		
		Student stu1 = (Student)event.getComponent().getAttributes().get("kou");
		
		student = stu1;
		
		/*

		System.out.println("Index is :"+studentList.indexOf(stu1));
		System.out.println(stu1.getName());
		System.out.println(stu1.getCls());
		System.out.println(stu1.getRoll());
		System.out.println(stu1.getAddress());
		
		*/
		
		index=studentList.indexOf(stu1);
		
		
		name=stu1.getName();
		cls=stu1.getCls();
		roll=stu1.getRoll();
		address=stu1.getAddress();
		
		markList=stu1.getMarkList();

		
	}
	
	public String update() { 
		try {
		Student stu2 = new Student(name, cls, roll, address);
		stu2.getMarkList().addAll(markList);
		studentList.set(index,stu2);
		markList.clear();
		
		}catch (Exception e) {
			System.out.println(e);
			
		}
		return null;

	}
	
	public void delete(ActionEvent event) {
		Student stu3 = (Student)event.getComponent().getAttributes().get("kou");
		student = stu3;
		/*
		System.out.println("Index is :"+studentList.indexOf(stu3));
		System.out.println(stu3.getName());
		System.out.println(stu3.getCls());
		System.out.println(stu3.getRoll());
		System.out.println(stu3.getAddress());
		*/
		index=studentList.indexOf(stu3);
		
		studentList.remove(index);
		
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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



	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}



	public List<Submarks> getMarkList() {
		return markList;
	}

	public void setMarkList(List<Submarks> markList) {
		this.markList = markList;
	}



	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}



	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}



}
