package day10;

import java.util.HashMap;
//import java.util.Map;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap <Integer, String> hm = new HashMap <Integer, String>();
		
		//HashMap <Integer, String, String> testhm = new HashMap <Integer, String, String>();
		
		hm.put(1, "alexa");
		hm.put(2, "beta");
		hm.put(3, "chloe");
		System.out.println(hm);
		hm.put(3, "ccatrine");
		System.out.println(hm);
		hm.remove(3);
		System.out.println(hm);
		
		for (Map.Entry m:hm.entrySet())
		{
			//k=m.getKey();
			//str= m.getValue();
			System.out.println(" Key =  " +m.getKey() + "  Value   =" + m.getValue());
		}
		

	}

}
