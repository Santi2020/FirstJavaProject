/*
 * 10.	Define an HashMap state code and state name and print them.
 */
package classAssignments;

import java.util.HashMap;

public class HashMapDemoAssignment {

	public static void main(String[] args) {
		HashMap <String,String> hm = new HashMap <String,String>();
		hm.put("CA","California");
		hm.put("NJ", "New Jersey");
		hm.put("AZ", "Arizona");
		hm.put("AR", "Arkansas");
		hm.put("CA","Calculus");
		System.out.println(hm);
		
		System.out.println("Contains Key CA = "+ hm.containsKey("CA"));
		System.out.println("Contains value California = "+ hm.containsValue("California"));
		System.out.println("Get AZ = "+ hm.get("AZ"));
		System.out.println("KeySet = "+ hm.keySet());
		hm.remove("CA");
		hm.putIfAbsent("CA", "California NEW");
		System.out.println("HM =  "+hm); 
	}

}


