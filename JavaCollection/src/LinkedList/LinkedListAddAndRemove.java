package LinkedList;

import java.util.LinkedList;

public class LinkedListAddAndRemove {

	public static void main(String[] args) {
		LinkedList<String> cities=new LinkedList<String>();
		cities.add("Bhubaneswar");
		cities.add("Pune");
		cities.add("Hyderabad");
		cities.add("Bengalore");
		cities.add("Munnar");
		cities.add("Kashmir");
		cities.add("Monali");
		System.out.println("Elements in the LinedList: "+cities);
		cities.remove();
		System.out.println("Elements after removing a specific index: "+cities);
		cities.remove();
		System.out.println("Elements after removing a specific index: "+cities);
		cities.remove(3);
		System.out.println("Elements after removing a specific index: "+cities);
		cities.removeAll(cities);
		System.out.println("Elements after using removeAll method: "+cities);

		
		
	}

}
