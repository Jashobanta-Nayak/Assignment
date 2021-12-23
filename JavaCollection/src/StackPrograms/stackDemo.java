package StackPrograms;

import java.util.Stack;

public class stackDemo {

	public static void main(String[] args) {
		Stack<String> sc=new Stack<String>();
		sc.push("Jasho");
		sc.push("Deba");
		sc.push("Akash");
		sc.push("Rashmi");
		sc.push("Sashi");
		//sc.push("Jasho");
		System.out.println("The elements in the stack is: "+sc);
		System.out.println(sc.peek());
		System.out.println(sc.search("Sashi"));
		System.out.println(sc.pop());
		System.out.println("The elements in the stack after pop opration is: "+sc);
	}

}
