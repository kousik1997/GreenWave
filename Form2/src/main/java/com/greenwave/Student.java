package com.greenwave;

import java.util.ArrayList;
import java.util.List;



public class Student {
	private String name;
	private int cls;
	private int roll;
	private String address;
	private List<Submarks> markList = new ArrayList<Submarks>();

	public Student(String name,int cls,int roll,String address  ) {
		this.name=name;
		this.cls=cls;
		this.roll=roll;
		this.address=address;
		this.markList = new ArrayList<Submarks>();
	}
	
	public static class Submarks {
		

		private String subject;
		private int marks;

		public Submarks(String subject,int marks) {
			this.subject=subject;
			this.marks=marks;
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

}




