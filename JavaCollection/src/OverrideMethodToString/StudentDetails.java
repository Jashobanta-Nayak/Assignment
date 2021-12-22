package OverrideMethodToString;

import java.util.ArrayList;

public class StudentDetails {
	public static void main(String[] args) {
		
		
		// in order to store the student details
		//i will go ahead and create a ArrayList
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student("Sachin",28,"Mumbai"));
		al.add(new Student("Dhoni",27,"Ranchi"));
		al.add(new Student("Yivraj",28,"Punjab"));
		al.add(new Student("Virat",25,"Bangaloe"));
		al.add(new Student("Rohit",26,"Mumbai"));
		for(Student details:al) {
			System.out.println(details);
		}
	}

}
