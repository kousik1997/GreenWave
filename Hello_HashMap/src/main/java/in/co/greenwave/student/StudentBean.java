package in.co.greenwave.student;


import java.util.HashMap;

import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean
@RequestScoped
public class StudentBean {
	//private String studentName;
	//private int studentRoll;

	private Map<String,Integer> studentMap= new HashMap<String,Integer>();
	

	private int rollNoFromMap;
	private String studentName;

	
	@PostConstruct
	public void init() {
		//this.studentName = "Azarul";
		//this.studentRoll =-999;
		//System.out.println("init called");
		
		
		/*initializing Map*/
		studentMap.put("Somnath",101 );
		studentMap.put("Tarun",102 );
		studentMap.put("Azarul",103 );
		studentMap.put("Koushik",104 );
		studentMap.put("Kashif",105 );
		
	
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
	//System.out.println("Name: "+studentName);
		System.out.println("Student roll from Map---"+rollNoFromMap);
		
		switch (rollNoFromMap) {
		
		case 101:
			System.out.println("Name : Somnath , Roll : "+rollNoFromMap);
		    break;
		case 102:
			System.out.println("Name : Tarun , Roll : "+rollNoFromMap);
		    break;
		case 103:
			System.out.println("Name : Azarul , Roll : "+rollNoFromMap);
		    break;
		case 104:
			System.out.println("Name : Koushik , Roll : "+rollNoFromMap);
		    break;
		case 105:
			System.out.println("Name : Kashif , Roll : "+rollNoFromMap);
		    break;
		    

		}
	}
	
	
	public Map<String, Integer> getStudentMap() {
		return studentMap;
	}
	public void setStudentMap(Map<String, Integer> studentMap) {
		this.studentMap = studentMap;
	}

	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	
	public int getRollNoFromMap() {
		return rollNoFromMap;
	}
	public void setRollNoFromMap(int rollNoFromMap) {
		this.rollNoFromMap = rollNoFromMap;
	}
	
	
}
