package HashMap_Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapCollection {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1,"Jasho");
		hm.put(3,"Deba");
		hm.put(4,"Rashmi");
		hm.put(2,"Sashi");
		hm.put(5,"Bikash");
		//System.out.println("Elements to the HashMap is: "+hm);
		
		Set<Entry<Integer, String>> values=hm.entrySet();
		Iterator<Entry<Integer, String>> itr=values.iterator();
		while(itr.hasNext()) {
			Entry<Integer, String> mEntry=(Entry<Integer, String>) itr.next();
			System.out.println(mEntry.getKey()+" "+mEntry.getValue());
		}
		

		
	}

}
