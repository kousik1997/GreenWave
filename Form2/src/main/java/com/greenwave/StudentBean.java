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
	
	private String subject;
	private int marks;
	//private Student st;
	//int id;
	
	
	
	
	private List<Student> studentList = new ArrayList<Student>();
	private List<Submarks> markList = new ArrayList<Submarks>();
	
	 
	 
	
	public void add() {
		//Student stu = (Student)event.getComponent().getAttributes().get("kou");
	
		Student tempStudent = new Student(name,cls,roll,address);
		studentList.add(tempStudent);
		
		
	
		//System.out.println("kk");
		//id=studentList.indexOf(tempStudent);
		//markList.clear();
		//st=tempStudent;
		//markList.add(tempStudent.new Submarks(subject,marks));
		//tempStudent.markList.add(subject,marks);
		
	}
	public String onMarksAdd() {
		System.out.println("StudentBean.onMarksAdd()");
		markList.add(new Submarks(subject, marks));
		return null;
	}
	

	public String submit() {
		//Student.Submarks tempsubmarks = st.new Submarks(subject,marks);
		//markList.add(st.new Submarks(subject,marks));
	
		//markList.add(tempsubmarks);
		
		//inner.add(tempsubmarks); 
		
		//outer.add(inner);
		Student stu = new Student(name, cls, roll, address);
		stu.getMarkList().addAll(markList);
		studentList.add(stu);
		markList.clear();
		return null;
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
