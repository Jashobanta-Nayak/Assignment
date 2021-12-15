package JavaOOPSProgram;

public class Computer {
	// These all are instance variable
	String name;
	String language;
	String city; 
	String state;
	public Computer() {
		// Here i am initialize the variable inside the constructor
		name="Jashobanta";
		language="Java_core-OOP";
		city="Balasore";
		state="Odisha";
	}
	public static void main(String[] args) {
		Computer com=new Computer();
		// To print the variable with the help of object 
		System.out.println(com.name);
		System.out.println(com.language);
		System.out.println(com.city);
		System.out.println(com.state);
	}
}
