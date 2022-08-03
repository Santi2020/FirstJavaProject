
package apex.assignments;

import java.util.Scanner;

//1.	Given an array of integers, find two numbers such that they 
//add up to a specific target number
public class FindTwoNumbersFromArray {

	public static void main(String[] args) {
		int[] arrNum = {2,8,6 ,9,5,19,12,20,45,81,1};
		Scanner sc = new Scanner(System.in);
		int inputNum;
		
		//Display the array of numbers
		for(int i:arrNum) {
			System.out.print(" " + i);
		}
		
		//Accept target number from the user
		System.out.println("\nEnter the target number :");
		inputNum = sc.nextInt();
		boolean elementsFound = false ;
		for(int i=0; i<arrNum.length ; i++) {
			for (int j=i+1 ; j<arrNum.length; j++) {
				if (!elementsFound){
					if(i!=j) {
						if ((arrNum[i]+arrNum[j]) == inputNum) {
							System.out.println(arrNum[i] + " + " +arrNum[j] + " = " +(arrNum[i]+arrNum[j]));
							elementsFound = true;
							break;
						}
					}
				}
			}	
		}

		if (elementsFound){
			System.out.println("Search successful");
		}
		else {
			System.out.println("Search unsuccessful. No two elements add to target number of " + inputNum);
		}
		sc.close();
	}

}


