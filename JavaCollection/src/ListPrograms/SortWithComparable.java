package ListPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
	private String name;
	private int rollNo;
	private int age;
	public Student(String name, int rollNo, int age) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Student stAge) {
		return age;
	}
 
	
}
public class SortWithComparable {
	public static void main(String[] args) {
	ArrayList<Student> array=new ArrayList<Student>();
	array.add(new Student("Jasho",23,24));
	array.add(new Student("Sashi", 12, 23));
	array.add(new Student("Akash",43,25));
	Collections.sort(array);
	for(Student st:array) {
		System.out.println(st);
	}
	
	}
}
