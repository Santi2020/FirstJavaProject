package classAssignments;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableCollection {

	public static void main(String[] args) {
		//Hashtable hash = new Hashtable(); //capacity is 11 load factor = .75
		//Hashtable hash = new Hashtable(45, (float) .90);
		Hashtable<Integer, String> hash = new Hashtable <Integer, String> ();
		hash.put(1, "John");
		hash.put(2, "David");
		hash.put(3, "George");
		//hash.put(null, null);
		System.out.println(hash);
		System.out.println(".get(3) = " + hash.get(3)
						+"\ncontains('David') = " + hash.contains("David")
						+"\ncontainsValue(1) =" + hash.containsValue(1)
						+"\n remove(3)" + hash.remove(3)
						+"\n After removing" + hash);
		
		System.out.println("\n\nDisplaying the values using entry set");
		for(Map.Entry entry : hash.entrySet())
			System.out.println(entry);
		
		
		Set s = hash.entrySet();
		
		
		System.out.println("\n\nDisplaying the values using Iterator");
		Iterator it  = s.iterator();
		while(it.hasNext()) {
			Map.Entry entry = (Entry) it.next();
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}
	}

}


