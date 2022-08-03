package classAssignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class ArrayListDemo {

	public static void main(String[] args) {
		List <String> arrlst = new ArrayList <String>();
		System.out.println("Size =" + arrlst.size());
		 
		arrlst.add("CA");
		arrlst.add("NJ");
		arrlst.add("AZ");
		arrlst.add("NJ");
		System.out.println(arrlst);
		System.out.println("Size =" + arrlst.size());
		
		System.out.println("\nHASHSET");
		System.out.println("=======================================");
		HashSet<String> hashset = new HashSet <String>();
		hashset.add("CA");
		hashset.add("MN");
		hashset.add("NJ");
		hashset.add("AZ");
		hashset.add("NJ");
		hashset.add("MI");
		System.out.println(hashset);
		System.out.println("Size =" + hashset.size());
		
		System.out.println("\nTREESET");
		System.out.println("=======================================");
		TreeSet<String> treeset = new TreeSet <String>();
		treeset.add("CA");
		treeset.add("MN");
		treeset.add("NJ");
		treeset.add("AZ");
		treeset.add("MI");
		treeset.add("CA");
		System.out.println(treeset);
		System.out.println("Size =" + treeset.size());
	

		
		
	}

}



