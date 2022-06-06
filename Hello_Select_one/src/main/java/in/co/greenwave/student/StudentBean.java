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
	private String studentName;
	private int studentRoll;
	private List<Student> studentList = new ArrayList<Student>();
	private Map<String,Integer> studentMap= new HashMap<String,Integer>();
	private SelectItem[] stdentDetails = new SelectItem[5] ;
	
	private int rollNoFromArrayList;
	private int rollNoFromMap;
	private int rollNoFromArray;
	
	@PostConstruct
	public void init() {
		this.studentName = "Azarul is ss a Bal";
		this.studentRoll =-999;
		System.out.println("init called");
		
		/*initializing ArrayList of Student*/
		studentList.add(new Student("Somnath",-101));
		studentList.add(new Student("Tarun",-102));
		studentList.add(new Student("Azarul",-103));
		studentList.add(new Student("Koushik",-104));
		studentList.add(new Student("Kashif",-105));
		System.out.println("student list  "+studentList.toString());
		
		/*initializing Map*/
		studentMap.put("Somnath",-101 );
		studentMap.put("Tarun",-102 );
		studentMap.put("Azarul",-103 );
		studentMap.put("Koushik",-104 );
		studentMap.put("Kashif",-105 );
		
		/*initializing Array of SelectItem*/
		stdentDetails[0]= new SelectItem(-101, "Somnath");
		stdentDetails[1]= new SelectItem(-102, "Tarun");
		stdentDetails[2]= new SelectItem(-103, "Azarul");
		stdentDetails[3]= new SelectItem(-104, "Koushik");
		stdentDetails[4]= new SelectItem(-105, "Kashif");
		
		
	}
	public String getStudentName() {
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
	 
	public void submit() {
		System.out.println("Submitted");
		System.out.println("Student roll from ArrayList---"+rollNoFromArrayList);
		System.out.println("Student roll from Map---"+rollNoFromMap);
		System.out.println("Student roll from Array---"+rollNoFromArray);
	}
	public SelectItem[] getStdentDetails() {		
		return stdentDetails;
	}
	public void setStdentDetails(SelectItem[] stdentDetails) {
		this.stdentDetails = stdentDetails;
	}
	
	public Map<String, Integer> getStudentMap() {
		return studentMap;
	}
	public void setStudentMap(Map<String, Integer> studentMap) {
		this.studentMap = studentMap;
	}
	public List<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	public int getRollNoFromArrayList() {
		return rollNoFromArrayList;
	}
	public void setRollNoFromArrayList(int rollNoFromArrayList) {
		this.rollNoFromArrayList = rollNoFromArrayList;
	}
	public int getRollNoFromMap() {
		return rollNoFromMap;
	}
	public void setRollNoFromMap(int rollNoFromMap) {
		this.rollNoFromMap = rollNoFromMap;
	}
	public int getRollNoFromArray() {
		return rollNoFromArray;
	}
	public void setRollNoFromArray(int rollNoFromArray) {
		this.rollNoFromArray = rollNoFromArray;
	}
}
