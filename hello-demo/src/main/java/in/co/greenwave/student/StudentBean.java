package in.co.greenwave.student;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.view.ViewScoped;

@ManagedBean
@RequestScoped
public class StudentBean {
	private String studentName;
	private int studentRoll;
	private int studentClass;

	public String getStudentName() {
		//System.out.println("getter called ----"+ studentName);
		return studentName;
	}

	public void setStudentName(String studentName) {
		//System.out.println("setter called......."+ studentName);
		this.studentName = studentName;
	}
	
	public void submit() {
		System.out.println("Student Name  is - "+ studentName+" , Student Roll No - "+ studentRoll+" , Student Class - "+studentClass);
	}

	public int getStudentRoll() {
		return studentRoll;
	}

	public void setStudentRoll(int studentRoll) {
		this.studentRoll = studentRoll;
	}

	public int getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(int studentClass) {
		this.studentClass = studentClass;
	}
	
	
	
	
}
