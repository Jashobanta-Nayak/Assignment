package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListRepresentation {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("jasho");
		ll.add("jash");
		ll.add("jas");
		ll.add("ja");
		ll.add("j");
		System.out.println(ll);
		/*System.out.println("Presentation of LinkedList with the help of ForEach loop: ");
		for(String list:ll) {
			System.out.println(list);
		}*/
		ll.addFirst("Jashob");
		ll.addLast("Jashoba");
		ll.add(2, "Jashoban");
		System.out.println("After adding some more elememts to LinkedList: "+ll);
		Iterator<String> itr=ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
