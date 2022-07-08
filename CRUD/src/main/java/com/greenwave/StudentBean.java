package com.greenwave;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;


@ManagedBean
@ViewScoped
public class StudentBean {
	private int id;
	private String name;
	private String gender;
	private String address;
	private Student student;
	
	public int catchid;
	
	
	ArrayList<Student> studentList = new ArrayList<Student>();

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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	
	public Connection connectDB(){  
		Connection conn=null;

			String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
			String url = "jdbc:sqlserver://192.168.1.80:1433;databaseName=Practice_DB";
			String user = "sa";
			String pass = "Greenwave@123";

		try {
			Class.forName(driver);     
			conn = (Connection) DriverManager.getConnection(url, user, pass);
			if (conn == null) {
			System.out.println("Connection cannot be established");
			}
		}catch(Exception e) {
		System.out.println(e);
		}
		
		return conn;  
	}
	
	public String submit() {		
			System.out.println("Name:"+name+" / Gender:"+gender+" / Address:"+address);
		
		try {
			Connection conn=connectDB();

			//inserting a record
			PreparedStatement stmt = conn.prepareStatement("insert into student(name,gender,address) values(?,?,?)");  						

			stmt.setString(1,this.getName());
			stmt.setString(2,this.getGender());
			stmt.setString(3,this.getAddress());
			stmt.executeUpdate(); 

			System.out.println("insert successfully into table");
			conn.close();

		}catch(Exception e) {
			System.out.println(e);
		}

		return null;
	}
	
	public void view() {
		
			try {
				studentList.clear();
		Connection conn=connectDB();
		Statement stmt= conn.createStatement();
		ResultSet rs=stmt.executeQuery("select * from student");
		while(rs.next()){  
			//StudentBean use = new StudentBean();
			//use.setId(rs.getInt("id"));
			//use.setName(rs.getString("name"));
			//use.setGender(rs.getString("gender"));
			//use.setAddress(rs.getString("address"));
			//System.out.println(rs.getInt("id")+rs.getString("name")+rs.getString("gender")+rs.getString("address"));
			//studentList.add(use); 
			
			studentList.add(new Student(rs.getInt("id"),rs.getString("name"),rs.getString("gender"),rs.getString("address")));
		}
		//System.out.println(studentList);
		
		conn.close(); 
		
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
	public void show(ActionEvent event) {
		
		Student st = (Student)event.getComponent().getAttributes().get("kou");
		student = st;
		//System.out.println("Index is :"+studentList.indexOf(stu));
		//id=stu.getId();
		name=st.getName();
		gender=st.getGender();
		address=st.getAddress();
		catchid=st.getId();
		System.out.println(catchid);
		
	}
	
	public void update() {
		try {
			Connection conn=connectDB();
			PreparedStatement stmt = conn.prepareStatement("update student set name = ?, gender = ?,address = ? where Id=" + catchid);
			stmt.setString(1, this.getName());
			stmt.setString(2, this.getGender());
			stmt.setString(3, this.getAddress());
			stmt.executeUpdate();
			System.out.println("update successfully");
			conn.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	public void delete(ActionEvent event) {
		Student std = (Student)event.getComponent().getAttributes().get("kous");
		try {
		student = std;		
		catchid=std.getId();
		Connection conn=connectDB();
		PreparedStatement stmt = conn.prepareStatement("delete from student where ID = " + catchid);  
		stmt.executeUpdate();
		
		System.out.println("delete done Id "+catchid);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
	



