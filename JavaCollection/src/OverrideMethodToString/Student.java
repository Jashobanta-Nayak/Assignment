package OverrideMethodToString;

public class Student {
	// i would like to store some student details
	private String studentName;
	private int studentAge;
	private String city;
	
	// we need a constructor to initialize the value into the instance variable
	public Student(String studentName, int studentAge, String city) {
		super();
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentAge=" + studentAge + ", city=" + city + "]";
	}
	
	
	
}
