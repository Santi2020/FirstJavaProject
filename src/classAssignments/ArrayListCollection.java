package classAssignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListCollection {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Welcome");
		al.add('c');
		al.add(27);
		al.add("java");
		al.add(29.80);
		System.out.println(al);
		System.out.println("Size = " + al.size());
		al.remove("Welcome");
		
		System.out.println(al);
		System.out.println("Size = " + al.size());
		
		System.out.println("al.get(3) = " + al.get(3));
		
		System.out.println("Reading elements using Iterartor");
		Iterator it = al.iterator();
		while(it.hasNext()) {
			System.out.println(" " + it.next());
		}
		
		
		ArrayList alNew = new ArrayList(Arrays.asList(al));
		System.out.println("New ArrayList =  " +alNew);
		System.out.println("Old ArrayList =  " +al);
		
		String Animals[] = {"Dog" , "Cat" , "Elephant"};
		ArrayList alAnimals = new ArrayList(Arrays.asList(Animals));
		System.out.println("New ArrayList =  " +alAnimals);
		
		System.out.print("Old ArrayList =  " );
		for (String ani : Animals)
			System.out.print("  " +ani);
		
	}

}
