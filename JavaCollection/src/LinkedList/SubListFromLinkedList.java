package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SubListFromLinkedList {

	public static void main(String[] args) {
		//inkedList & it's SubList
		LinkedList<String> grocessary=new LinkedList<String>();
		grocessary.add("Rice");
		grocessary.add("Oil");
		grocessary.add("Dal");
		grocessary.add("Soap");
		grocessary.add("Shampo");
		grocessary.add("Salt");
		grocessary.add("Sugar");
		System.out.println(grocessary);
		//Loop<----iteration process
		Iterator<String> itr=grocessary.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		// Obtaining SubList from the grocessary LinkedList
		List<String> sublist=grocessary.subList(3, 5);
		//LinkedList<String> sublist=(LinkedList<String>) grocessary.subList(3, 5);
		System.out.println(sublist);
	}

}
