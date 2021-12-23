package HashMap_Collection;

import java.util.HashMap;

public class FindKeysInHashMap {

	public static void main(String[] args) {
		
		
		// Check if a particular key exist in HashMap....!!!
		HashMap<Integer, String> sports=new HashMap<Integer,String>();
		
		// adding the elements to the HashMap
		sports.put(11, "Cricket");
		sports.put(12, "Football");
		sports.put(13, "Baseball");
		sports.put(14, "Hockey");
		sports.put(15, "Rogby");
		
		// Checking Key existence
		// whether 13 is present or not---- if present it will give true else throws false
		boolean var=sports.containsKey(13);
		System.out.println("Key 313 is present in HashMap ? "+var);
		
		// Checking value existence
				// whether Baseball is present or not---- if present it will give true else throws false
				boolean vari=sports.containsValue("Baseball");
				System.out.println("value Baseball is present in HashMap ? "+vari);
	}

}
