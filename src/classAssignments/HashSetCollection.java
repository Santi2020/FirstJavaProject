package classAssignments;

import java.util.HashSet;
import java.util.Iterator;

import oracle.net.aso.e;

public class HashSetCollection {

	public static void main(String[] args) {
		//HashSet <Integer> hs = new HashSet<Integer>();
		HashSet  hs = new HashSet();
		System.out.println("Capacity=" + hs.size());
		hs.add(50);
		hs.add("welcome");
		hs.add(true);
		hs.add(59.99);
		System.out.println("HastSet=" + hs);
		hs.remove(59.99);
		System.out.println("After removing HastSet=" + hs);
		System.out.println("HastSet contains=" + hs.contains("welcome"));
		
		System.out.println("=".repeat(25));
		System.out.println("Displaying values using iterator");
		Iterator<e> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("=".repeat(25));
		
		System.out.println("=".repeat(25));
		System.out.println("Displaying values using for loop");
		for(Object j : hs)
			System.out.println(" " + j);
		
		System.out.println("=".repeat(25));
		
		HashSet <Integer> evennumber = new HashSet<Integer>();
		evennumber.add(2);
		evennumber.add(4);
		evennumber.add(6);
		evennumber.add(8);
		evennumber.add(10);
		System.out.println("=".repeat(25));
		System.out.println("evennumber = " + evennumber);
		System.out.println("HastSet hs =" + hs);
		
		System.out.println("Adding evennumber to hs =" );
		hs.addAll(evennumber);
		System.out.println("After adding  =" + hs);
		hs.removeAll(evennumber);
		System.out.println("After removing evennumber  =" + hs);
		System.out.println("=".repeat(25));
		
		
		System.out.println("=".repeat(25));
		System.out.println("=".repeat(25));
		
		HashSet <Integer> set1 = new HashSet();
		HashSet <Integer> set2 = new HashSet();
		
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(40);
		set1.add(50);
		
		
		
		set2.add(10);
		set2.add(20);
		set2.add(300);
		
		System.out.println("HashSet set1 =" + set1);
		System.out.println("HashSet set1 =" + set2);
		
		//union
		//set1.addAll(set2);
		//System.out.println("set1.addAll(set2 -- Union) =" + set1);
		
		//intersection
		//set1.retainAll(set2);
		//System.out.println("set1.retainAll(set2) -- intersection) =" + set1);
		
		//difference
		//set1.removeAll(set2);
		//System.out.println("set1.removeAll(set2) -- difference) =" + set1);
		
		//subset
		System.out.println("set1.containsAll(set2) = " +set1.containsAll(set2));
		
		
		
		
	}

}
