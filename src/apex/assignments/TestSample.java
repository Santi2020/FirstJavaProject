package apex.assignments;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestSample {
	
	public void testCollection() {
		Collection a = new ArrayList();
		List<Integer> lst = new ArrayList();
		
		System.out.println("Size of array at the begining =  " + lst.size()) ;
		
		lst.add(07);
		System.out.println("Size of array after 1st element =  " + lst.size()) ;
		
		lst.add(01);
		lst.add(03);
		for (int i : lst)
			System.out.print(" " + i);
		
		System.out.println("\n"+"=".repeat(25));
		
		System.out.println("\n\n After st.addAll(lst )" );
		lst.addAll(lst);
		for (int i : lst)
			System.out.print(" " + i);
		
		System.out.println("\n"+"=".repeat(25));
		
		System.out.println("\n\n After lst.addAll(1, lst) " );
		lst.addAll(1, lst);
		for (int i : lst)
			System.out.print(" " + i);
		
		lst.add(999);
		
		System.out.println("\n\n After sorting" );
		//lst.addAll(1, lst);
		Collections.sort(lst);
		for (int i : lst)
			System.out.print(" " + i);
		
		
		System.out.println("\n\n After Shuffle" );
		//lst.addAll(1, lst);
		Collections.shuffle(lst); 
		for (int i : lst)
			System.out.print(" " + i);
		
		
		System.out.println("\n" + "=".repeat(25));
		ArrayList al = new ArrayList();
		al.add("One");
		al.add(22);
		al.add(33.123);
		
		for (Object i : al)
			System.out.print(" " + i);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[] objArray = new Object[10];
		int a[] = new int[10];
		a[1]=10;
		/*
		for( int i : a)
			System.out.println(" " + i);
		*/
		
		
		TestSample coll = new TestSample();
		coll.testCollection();
	}

	
	
}
