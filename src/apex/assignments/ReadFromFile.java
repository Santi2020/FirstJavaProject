/*
 * 14.	Read from a file and find out most repeated word
 */
package apex.assignments;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class ReadFromFile {
	HashMap<String , Integer > wordsCountHashMap = new HashMap<String , Integer >();
	
	public void getWordCounts(String filePath) throws IOException {
		String path ="C://Users//TISHAN1KA//eclipse-workspace//FirstJavaProject/readfiledemo.txt";
		File file = new File(path);
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line;
		
		if (file.exists()) {
			while((line=br.readLine()) != null) {
				System.out.println(line);
				String[] wordArray = line.split(" ");
				for(String word : wordArray) {
					//System.out.print( " " + s);
					if (!wordsCountHashMap.containsKey(word)) {
						wordsCountHashMap.put(word, 1);
					}
					else {
						int cnt = wordsCountHashMap.get(word);
						cnt=cnt+1;
						wordsCountHashMap.put(word, cnt);
					}
				}
			}
		}
		else
		{
			System.out.println("File does not exists");
		}
		
		System.out.println("\n");
		System.out.println("=".repeat(25));
		System.out.println("Word           Count");
		System.out.println("=".repeat(25));
		for (String word :wordsCountHashMap.keySet()) {
			System.out.println(word.concat(" ".repeat(15-word.length())) + "   " + wordsCountHashMap.get(word));
		}
		System.out.println("=".repeat(25));
	}
	
	public static void main(String[] args) throws IOException {
		ReadFromFile readFile = new ReadFromFile();
		String filePath ="C://Users//TISHAN1KA//eclipse-workspace//FirstJavaProject/readfiledemo.txt";
		String a="";
		readFile.getWordCounts(filePath);
	}

}
