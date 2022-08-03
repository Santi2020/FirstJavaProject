/*
 * 12.	Given a string find
o	most repeated character
o	number of times each character is repeated
o	arrange in the order of repeat ions

 */
package apex.assignments;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

public class CharCounts {
	public HashMap<Character, Integer> findRepeatedChar(String inputStr) {
		
		HashMap<Character, Integer> charCountHashMap = new HashMap<Character, Integer>();
		char[] charArray = inputStr.toCharArray();
		char mostRepeatedChar= ' ' ;
		int timesRepeated=0;
		
		for (char c : charArray)
			System.out.print(c + " " );
		
		for (int i =0 ; i<charArray.length; i++) {
			char ch = charArray[i];
			if (ch !=' ') {
				if (!charCountHashMap.containsKey(ch)) {
					charCountHashMap.put(ch, 1);
				}
				else {
					int cnt = charCountHashMap.get(ch);
					cnt = cnt+1;
					charCountHashMap.put(ch, cnt);
					if (cnt> timesRepeated) {
						timesRepeated = cnt;
						mostRepeatedChar = ch;
					}
				}
			}
		}
		
		System.out.println("\nMost repeated character is '" + mostRepeatedChar +"'");
		return charCountHashMap;
	}
	
	public void displayCharacterCounts(HashMap<Character , Integer> charCountHashMap) {
		System.out.println("Number of time the character repeated");
		for(char ch :charCountHashMap.keySet() ) {
			int repeated = charCountHashMap.get(ch);
			System.out.println( ch +" = " +repeated);
		}
		
		
		System.out.println("Entry set = " +charCountHashMap.entrySet() );
		
	}
	
	
	public void sortByValue(HashMap<Character , Integer> charCountHashMap)
	{
		//INCOMPLETE
		/*
		//convert HashMap into List   
		List<Entry<String, Integer>> list = new LinkedList<Entry<String, Integer>>(charCountHashMap.entrySet());  
		//sorting the list elements  
		Collections.sort(list, new Comparator<Entry<String, Integer>>()   
		{  
			
		}
		*/
	}
	
	
	public static void main(String[] args) {
		CharCounts charCounts = new CharCounts();
		String str ="this is a sentence";
		str ="wwwisjavaworld";
		//char mostRepeatedChar ;
		HashMap<Character, Integer> charHashMap = new HashMap<Character, Integer>();
		charHashMap = charCounts.findRepeatedChar(str);
		charCounts.displayCharacterCounts(charHashMap);
		
	}

}
