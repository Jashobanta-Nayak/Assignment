package ListPrograms;

import java.util.ArrayList;

public class ArrayListProgram {
	public static void main(String[] args) {
		ArrayList<String> obj=new ArrayList<String>();
		obj.add("Jasho");
		obj.add("Sashi");
		obj.add("Rashmi");
		obj.add("Deba");
		System.out.println(obj);
		
		obj.add(2,"Akash");
		System.out.println(obj);
		obj.remove(3);
		System.out.println(obj);
		System.out.println(obj.get(1));
		System.out.println(obj.contains("Jasho"));
		System.out.println("Elements are  arranged after for loop!!!!");
		for(int i=0;i<obj.size();i++) {
			System.out.println(obj.get(i));
		}
		System.out.println("Elements are  arranged after forEach loop!!!!");
		for(String ob:obj) {
			System.out.println(ob);
		}
	}

}
