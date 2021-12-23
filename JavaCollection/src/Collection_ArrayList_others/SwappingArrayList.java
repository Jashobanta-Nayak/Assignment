package Collection_ArrayList_others;

import java.util.ArrayList;
import java.util.Collections;

public class SwappingArrayList {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>();
		names.add("Sachin");
		names.add("Sourav");
		names.add("Rahul");
		names.add("Yuvraj");
		names.add("Laxman");
		names.add("Dhoni");

		System.out.println("ArrayList before swap: ");
		for(String temp:names) {
			System.out.println(temp);
		}
		//Swapping the 2nd element(index 1) element with 5th element(index 4).
		Collections.swap(names, 2, 5);
		System.out.println("ArrayList after swap: ");
		for(String temp:names) {
			System.out.println(temp);
		}
	}

}
