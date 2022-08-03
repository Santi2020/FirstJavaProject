package day10;
import java.util.ArrayList;
public class ArrayListDemo {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list1 = new ArrayList();
		ArrayList <String> list = new ArrayList <String>();
		
		list.add("OSR");
		list.add("ONM");
		list.add("OSSN");
		list.add("Value");
		System.out.println("Size of arraylist is " + (list.size()));
		
		System.out.println(list);
		list.remove(3);
		System.out.println(list);
		list.add(3,"Hello");
		if (list.size() >=10)
		{
			list.add(10, "New Member");
		}
		else
		{
			list.add(list.size(), "New Member else");
		}
		System.out.println("New List = " +list);
		
		System.out.println("before Size of arraylist is " + (list.size()));
		list.add(4, "new addition");
		list.add(4, "next new addition");
		System.out.println("Afer New addition = " +list);
		
		System.out.println("==========Enhanced for loop ========== " );
		
		for(String s :list)
		{
			System.out.println(s);
		}
		
		
		//====================================
		//ArrayList list1 = new ArrayList();
		ArrayList alist = new ArrayList();
		alist.add("1 A");
		alist.add("2 b");
		alist.add("3 C");
		alist.add(4);
		alist.add('D');
		System.out.println("Size of alist = " + (alist.size()));
		for (Object o :alist)
		{
			System.out.println(o);
		}
		
	}

}
