package classAssignments;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadContentsOfFile {

	public static void main(String[] args) throws IOException {
		File f = new File("C://santoshi//Selenium/readfiledemo.txt");
		BufferedReader br = new BufferedReader(new FileReader(f));
		String str;
		int counter=0;
		if (f.exists())
		{
			
			while((str=br.readLine()) != null)
			{
				System.out.println("line = " + str);
				for (int i=0; i<str.length();i++)
				{
					if (str.charAt(i) == 'a')
					{
						counter+=1;
						System.out.println("-- at index i=" +i + ". counter = "+ counter + " " +str.charAt(i));
					}
					
				}
			}
			
		}
		else
		{
			System.out.println("File does not exists");
		}
		System.out.println("Output of the program 'a' has appeared " +counter +" times");
		br.close();
	}

}





