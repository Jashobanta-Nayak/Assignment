package LinkedList;

import java.util.LinkedList;

public class GetElementsByIndex {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("j");
		ll.add("ja");
		ll.add("jas");
		ll.add("jash");
		ll.add("jasho");
		System.out.println("Elements in the LinkedList is: "+ll);
		System.out.println("LinkedList Elements: ");
		// get(index)
		for(int i=0;i<ll.size();i++) {
			System.out.println("Elements at index "+i+" is :"+ll.get(i));
		}
		System.out.println("Index occurance: "+ll.indexOf("jas"));
		
		
	}

}
