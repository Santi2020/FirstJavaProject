//Longest Sub string Without Repeating Characters
package apex.assignments;

import java.util.LinkedHashMap;

public class LongestSubstring {
	
	public String getLongestSubstring(String inputStr) {
		char[] charArray = inputStr.toCharArray();
		String longestSubstring=null;
		int lenOfLongestSubstring=0;
		LinkedHashMap<Character, Integer>  charPosHashMap = new LinkedHashMap();
		
		System.out.println("\nString = '" + inputStr + "'");
		
		for(char c : charArray)
			System.out.print(c+" ");
		
		for(int i =0; i< charArray.length; i++) {
			char c = charArray[i];
			if(!charPosHashMap.containsKey(c)) {
				charPosHashMap.put(c, i);
			}
			else {
				i=charPosHashMap.get(c);
				charPosHashMap.clear();
			}
			
			if (charPosHashMap.size()>lenOfLongestSubstring) {
				lenOfLongestSubstring = charPosHashMap.size();
				longestSubstring = charPosHashMap.keySet().toString();
			}
		}
		
		System.out.println("\nString=" + inputStr);
		System.out.println("Longest Substring = " + longestSubstring);
		System.out.println("Length of substring = " + lenOfLongestSubstring);
		System.out.println("============================================");
		return longestSubstring;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String outputStr;
		
		LongestSubstring ls = new LongestSubstring();
		
		String myString ="Thisisatesttocheckstringlength";
		outputStr =ls.getLongestSubstring(myString);
		
		myString = "javaconceptoftheday";
		outputStr =ls.getLongestSubstring(myString);
	
	}

}



	