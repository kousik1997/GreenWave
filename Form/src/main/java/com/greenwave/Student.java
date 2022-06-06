package com.greenwave;

public class Student {
	private String name;
	private String gender;
	private int cls;
	private int roll;
	
	public Student(String name,String gender,int cls,int roll) {
		this.name=name;
		this.gender=gender;
		this.cls=cls;
		this.roll=roll;
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
	@Override
	public String toString() {
		return "Student [Name= " + name + ", Gender= " + gender + " ,Class=" + cls +", Roll Number="+roll +"]";
	}
	
}
