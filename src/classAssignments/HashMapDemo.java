package classAssignments;

import java.util.HashMap;
//import java.util.List;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap <String,Integer> empIds = new HashMap <String,Integer>();
		empIds.put("Raghu", 1);
		empIds.put("Anika", 4);
		empIds.put("Tisha", 3);
		empIds.put("Santoshi",2);
		empIds.put("Surabhi", 15);
		empIds.put("Supriya", 21);
		System.out.println(empIds);
		
		System.out.println(empIds.containsKey(25));
		System.out.println(empIds.containsValue("Raghu"));
		System.out.println(empIds.get("Anika"));
		
		empIds.put("Supriya", 41);
		empIds.replace("Supriya1", 54);
		System.out.println(empIds);
		
		empIds.putIfAbsent("Uphaar", 19);
		System.out.println(empIds);
		
		empIds.putIfAbsent("Uphaar", 59);
		System.out.println(empIds);
		
		empIds.remove("Uphaar");
		System.out.println(empIds);
	}
}
