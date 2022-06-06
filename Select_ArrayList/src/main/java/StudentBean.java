import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;




@ManagedBean
@RequestScoped
public class StudentBean {
//	private String studentName;
//	private int studentRoll;
	
	private List<Student> studentList = new ArrayList<Student>();
	private int rollNoFromArrayList;
	
	@PostConstruct
	public void init() {
		//this.studentName = "Azarul is ss a Bal";
	//	this.studentRoll =-999;
		//System.out.println("init called");
		
		studentList.add(new Student("Somnath",-101));
		studentList.add(new Student("Tarun",-102));
		studentList.add(new Student("Azarul",-103));
		studentList.add(new Student("Koushik",-104));
		studentList.add(new Student("Kashif",-105));
		
		//System.out.println("student list  "+studentList.toString());
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
		System.out.println("Submitted");
		System.out.println("Student roll from ArrayList---"+rollNoFromArrayList);
		
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
	
}
