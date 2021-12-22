package ListPrograms;

import java.util.ArrayList;

public class RemoveMethod {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("AB");
		al.add("CD");
		al.add("EF");
		al.add("GH");
		System.out.println("ArrayList before remove: ");
		for(String var:al) {
			System.out.println(var);
		}
		// Removing elements
		al.remove(0);
		System.out.println("ArrayList after remove: "+al);
		al.removeAll(al);
		System.out.println("ArrayList after romoving all elements: "+al);
	}
}
