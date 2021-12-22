package ListPrograms;

import java.util.ArrayList;
import java.util.List;

public class CopyArratList {
	public static void main(String[] args) {
		//creating the object of ArrayList Class
		ArrayList<Integer> array=new ArrayList<Integer>();
		// added some elements to ArrayList using add() method 
		array.add(10);
		array.add(20);
		array.add(30);
		array.add(40);
		System.out.println("arrayList elements are: "+array);
		// Here we have copied 1st ArrayList Elements to 2nd ArrayList 
		List<Integer> list=new ArrayList<Integer>(array);
		//list.addAll(array);
		// After copying , we have added some other elements
		list.add(50);
		list.add(60);
		list.add(70);
		System.out.println("ArrayList elements are after copying previous elements: "+list);
	}

}
