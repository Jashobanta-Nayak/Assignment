package LinkedList;

import java.util.LinkedList;

public class ObjectsInLinkedList {

	public static void main(String[] args) {
		// Creating an Object for LinkedList
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("item1");
		ll.add("item4");
		ll.add("item3");
		ll.add("item6");
		ll.add("item2");
		ll.add("item5");
		// display the elements
		System.out.println("Elements of the LinkedList: "+ll);
		ll.addFirst("First item");
		ll.addLast("Last item");
		//ll.add(" "); // LinkedList also stores null value
		System.out.println(ll);
		// how to Get & Set values
		Object firstVal=ll.get(0) ;
		System.out.println("First Element: "+firstVal);
		ll.set(0, "Sachin");// here Sachin replace First item in the LinkedList using set()
		System.out.println(ll);
		ll.clear();
		System.out.println(ll);
	}

}
