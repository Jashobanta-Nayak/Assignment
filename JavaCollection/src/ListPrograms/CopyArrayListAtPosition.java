package ListPrograms;

import java.util.ArrayList;
import java.util.List;

public class CopyArrayListAtPosition {
	public static void main(String[] args) {
		ArrayList<String> array=new ArrayList<String>();
		array.add("j");
		array.add("ja");
		array.add("jas");
		array.add("jash");
		System.out.println(array);
		List<String> list=new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");
		// here i want to add all the 1st ArrayList elements in the 2nd index position
		list.addAll(2,array);
		System.out.println(list);
	}
}
