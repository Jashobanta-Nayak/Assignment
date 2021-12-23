package ListPrograms;

import java.util.ArrayList;

public class SearchAndGetMethodsToValue {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(1);
		al.add(11);
		al.add(42);
		al.add(33);
		al.add(44);
		al.add(35);
		al.add(66);	
		al.add(44);
		System.out.println(al);
		System.out.println("Value at 1st index position: "+al.get(1));
		System.out.println("Value at 3rd index position: "+al.get(3));
		System.out.println("Value at 0th index position: "+al.get(0));
		System.out.println("Value at 2nd index position: "+al.get(2));
		System.out.println("Value at 5th index position: "+al.get(5));
		
	}

}
