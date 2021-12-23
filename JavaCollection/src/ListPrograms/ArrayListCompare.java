package ListPrograms;

import java.util.ArrayList;

public class ArrayListCompare {

	public static void main(String[] args) {
		ArrayList<String> al1=new ArrayList<String>();
		//First arrayList
		al1.add("Hii");
		al1.add("Good");
		al1.add("After");
		al1.add("Noon");
		al1.add("TimeFor Lunch");
		System.out.println(al1);
		System.out.println("---------------------------------------");
		
		//Another arrayList
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("Hii");
		al2.add("Good");
		al2.add("After");
		al2.add("Non");
		al2.add("TimeFor Lunch");
		System.out.println(al2);
		System.out.println("---------------------------------------");
		
		//For comparing two ArrayList
		ArrayList<String> al_comp=new ArrayList<String>();
		for(String temp:al1) {
			al_comp.add(al2.contains(temp)?"Yes":"No");
			
		}
		System.out.println(al_comp);
	}

}
