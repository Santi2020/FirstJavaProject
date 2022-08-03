package classAssignments;

import java.util.Iterator;
import java.util.PriorityQueue;

import oracle.net.aso.e;

public class QueueCollection {

	public static void main(String[] args) {
		PriorityQueue  q =new PriorityQueue() ;
		
		//ading elements
		q.add(10);
		//q.add('2');
		/*
		q.add('b');
		q.add('c');
		*/
		q.offer(200);
		q.offer(1000);
		q.offer(100);
		
		System.out.println("Q =" + q);
		System.out.println("=".repeat(50));
		
		//get head element
		//System.out.println("Q.element =" +q.element());
		System.out.println("Q.peek =" +q.peek());
		System.out.println("Q =" + q);
		
		System.out.println("=".repeat(50));
		//remove head element
		//System.out.println("Q.remove =" +q.remove());
		System.out.println("Q.poll =" +q.poll());
		System.out.println("Q =" + q);
		System.out.println("=".repeat(50));
			
	Iterator it = q.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	}

}
