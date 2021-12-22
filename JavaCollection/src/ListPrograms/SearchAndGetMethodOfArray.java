package ListPrograms;

import java.util.ArrayList;

public class SearchAndGetMethodOfArray {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(1);
		al.add(11);
		al.add(42);
		al.add(33);
		al.add(44);
		al.add(35);
		al.add(66);
		// First index of an element<--------- inbuilt method i.e. IndexOf
		System.out.println("First occurance of the element at the first: "+al.lastIndexOf(35));
		System.out.println("First occurance of the element at the first: "+al.lastIndexOf(33));
		System.out.println("First occurance of the element at the first: "+al.indexOf(42));
		System.out.println("First occurance of the element at the first: "+al.indexOf(33));



	}

}
