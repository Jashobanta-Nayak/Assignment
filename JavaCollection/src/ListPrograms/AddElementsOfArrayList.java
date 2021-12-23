package ListPrograms;

import java.util.ArrayList;

public class AddElementsOfArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(5);
		al.add(15);
		al.add(25);
		al.add(35);
		al.add(45);
		int sum=0;
		for(Integer add:al) {
			sum=sum+add;
		}
		System.out.println("Sum Of All Elements Of An ArrayList is: "+sum);
	}
}
