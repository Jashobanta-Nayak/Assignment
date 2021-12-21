package MethodPrograms;
import java.util.Scanner;
public class BasicCalculator {
	// This method to calculate the addition of two numbers
	public int add(int num_one, int num_two) {
		int addition=num_one+num_two;
		return addition;
	}
	// This method to calculate the substraction of two numbers

	public int sub(int num_one, int num_two) {
		int substraction=num_one-num_two;
		return substraction;
	}
	// This method to calculate the multiplication of two numbers

	public int mul(int num_one, int num_two) {
		int multiplication=num_one*num_two;
		return multiplication;
	}
	// This method to calculate the division of two numbers

	public int div(int num_one, int num_two) {
		int division=num_one/num_two;
		return division;
	}
	// This method to calculate the module of two numbers

	public int mod(int num_one, int num_two) {
		int module=num_one%num_two;
		return module;
	}
	
	
	// This is the main method
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two nos: ");
		int num_one=sc.nextInt();
		int num_two=sc.nextInt();
		sc.close();
		// This is to create the object of BasicCalculator class
		BasicCalculator bc=new BasicCalculator();
		// To call add method
		int addition=bc.add(num_one, num_two);
		System.out.println("Addition of two no is: "+addition);
		// To call sub method

		int substraction=bc.sub(num_one, num_two);
		System.out.println("substraction of two no is: "+substraction);
		// To call mul method

		int multiplication=bc.mul(num_one, num_two);
		System.out.println("multiplication of two no is: "+multiplication);
		// To call div method

		int division=bc.div(num_one, num_two);
		System.out.println("division of two no is: "+division);
		// To call mod method

		int module=bc.mod(num_one, num_two);
		System.out.println("module of two no is: "+module);
		
		
	}
}
