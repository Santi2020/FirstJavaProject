package classAssignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import oracle.net.aso.e;

public class HashMapCollection {

	public static void main(String[] args) {
		// HashMap map= new HashMap();
		HashMap<Integer, String> map = new HashMap();
		map.put(10, "Simba");
		map.put(1, "One");
		map.put(2, "two");
		map.put(3, "three");
		map.put(5, "five");
		System.out.println("Map=" + map);

		map.put(5, "fifty five");
		System.out.println("map.put(5, \"fifty five\") = " + map);
		System.out.println("map.put(5, \"fifty five\") = " + map);
		System.out.println("map.put(5, \"fifty five\") = " + map);
		System.out.println("map.put(5, \"fifty five\") = " + map);
		System.out.println("map.put(5, \"fifty five\") = " + map);
		System.out.println("map.put(5, \"fifty five\") = " + map);
		System.out.println("map.put(5, \"fifty five\") = " + map);

		System.out.println("map.get(5) = " + map.get(5));
		System.out.println("contains(3) = " + map.containsKey(3));
		map.remove(3);
		System.out.println("After removing 3. contains(3) = " + map.containsKey(3));

		System.out.println("containsValue(One) = " + map.containsValue("One"));

		System.out.println("map.keySet = " + map.keySet());
		System.out.println("map.values = " + map.values());
		System.out.println("map.entrySet() = " + map.entrySet());

		System.out.println("\n\nReading the keys in for loop ");
		for (Object o : map.keySet())
			System.out.print(" " + o);

		System.out.println("\n\nReading the values in the for loop");
		for (Object o : map.values())
			System.out.print(" " + o);

		System.out.println("\n\nGet the values based on key");
		for (Object o : map.keySet())
			System.out.println("Key = " + o + " Value = " + map.get(o));

		System.out.println("\n\nEntery set ");
		for (Map.Entry entry : map.entrySet())
			System.out.println("Using entrySet Key=" + entry.getKey() + " Value = " + entry.getValue());

		// Iterator
		// System.out.println("\n\nUsing iterator " );
		Set s = map.entrySet();
		System.out.println("\n\nDisplaying set " + s);
		System.out.println("\n\nUsing iterator ");
		Iterator<e> it = s.iterator();
		while (it.hasNext()) {
			Map.Entry entry = (Entry) it.next();
			System.out.println("Key = " + entry.getKey() + " Value =" + entry.getValue());
		}
	}

}
