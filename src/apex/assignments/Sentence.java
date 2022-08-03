/*
 * 13.	Given a Sentence find 
o	most repeated word

 */
package apex.assignments;

import java.util.HashMap;

public class Sentence {
	HashMap<String, Integer> wordsHashMap = new HashMap <String, Integer>();
	
	public void getWordsCount(String str) {
		String[] strArray = str.split(" ");
		for (String word: strArray) {
			System.out.print(" " + word);
			if(!wordsHashMap.containsKey(word)) {
				wordsHashMap.put(word, 1);
			}
			else {
				int cnt = wordsHashMap.get(word);
				cnt= cnt+1;
				wordsHashMap.put(word, cnt);
			}
		}
		
		System.out.println("\n");
		System.out.println("------------------------------------");
		System.out.println("Word               Count");
		System.out.println("------------------------------------");
		for (String word :wordsHashMap.keySet()) {
			System.out.println(word.concat(" ".repeat(15-word.length())) + "       " + wordsHashMap.get(word));
		}
		System.out.println("------------------------------------");
	}
	
	public static void main(String[] args) {
		String str ="this is a sentence this is a long sentence";
		Sentence newSentence = new Sentence();
		newSentence.getWordsCount(str);
	}

}
