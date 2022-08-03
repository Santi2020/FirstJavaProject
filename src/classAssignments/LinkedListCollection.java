package classAssignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListCollection {
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList();
		ll.addFirst(100);
		ll.addFirst(200);
		
		ArrayList <Integer> al = new ArrayList();
		al.add(1);
		al.add(2);
		System.out.println("Linked List = " + ll);
		
		ll.addAll(al);
		
		ll.addLast(900);
		ll.offer(2022);
		System.out.println("Linked List = " + ll);
		System.out.println("Linked List ll.get(2) = " +ll.get(2));
		
		System.out.println("Reading the data using iterator");
		
		Iterator it = ll.iterator();
		while(it.hasNext()) {
			System.out.println("LL =" + it.next());
		}
		
	}
}
