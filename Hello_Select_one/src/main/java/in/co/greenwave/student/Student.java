package in.co.greenwave.student;

public class Student {
	private String name;
	private int roll;
	public Student(String name, int roll) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + "]";
	}
	
}
