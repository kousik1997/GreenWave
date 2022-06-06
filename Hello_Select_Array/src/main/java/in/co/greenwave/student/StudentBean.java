package in.co.greenwave.student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.model.SelectItem;

@ManagedBean
@RequestScoped
public class StudentBean {
	//private String studentName;
	//private int studentRoll;

	private SelectItem[] stdentDetails = new SelectItem[5] ;
	
	
	private int rollNoFromArray;
	
	@PostConstruct
	public void init() {
		//this.studentName = "Azarul is ss a Bal";
		//this.studentRoll =-999;
		//System.out.println("init called");
		
		
		
		/*initializing Array of SelectItem*/
		stdentDetails[0]= new SelectItem(101, "Somnath");
		stdentDetails[1]= new SelectItem(102, "Tarun");
		stdentDetails[2]= new SelectItem(103, "Azarul");
		stdentDetails[3]= new SelectItem(104, "Koushik");
		stdentDetails[4]= new SelectItem(105, "Kashif");
		
		
	}
	/*public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentRoll() {
		return studentRoll;
	}
	public void setStudentRoll(int studentRoll) {
		this.studentRoll = studentRoll;
	}
	 */
	public void submit() {
		//System.out.println("Submitted");
		
		System.out.println("Student roll from Array---"+rollNoFromArray);
		switch (rollNoFromArray) {
		
		case 101: 
			System.out.println("Name : Somnath , Roll : "+rollNoFromArray);
		    break;
		case 102: 
			System.out.println("Name : Tarun , Roll : "+rollNoFromArray);
		    break;
		case 103: 
			System.out.println("Name : Azarul , Roll : "+rollNoFromArray);
		    break;
		case 104: 
			System.out.println("Name : Koushik , Roll : "+rollNoFromArray);
		    break;
		case 105: 
			System.out.println("Name : Kashif , Roll : "+rollNoFromArray);
		    break;
		    

		}
		
	}
	public SelectItem[] getStdentDetails() {		
		return stdentDetails;
	}
	public void setStdentDetails(SelectItem[] stdentDetails) {
		this.stdentDetails = stdentDetails;
	}
	
	
	public int getRollNoFromArray() {
		return rollNoFromArray;
	}
	public void setRollNoFromArray(int rollNoFromArray) {
		this.rollNoFromArray = rollNoFromArray;
	}
}
