package classAssignments;

import java.util.Scanner;

/*
Write a program to a specified number of generate fibonacci series. 
Note: Read the required count from the keyboard 
 */

public class FibonnacciDemo {
	public void generateFibonacci(int howMany)
	{
		int num1=0;
		int num2=1;
		
		int ans ;
		System.out.print("Here is the fibo series using for loop  : \n" + num1 + " , "  + num2);
		
		for(int i =3;  i<=howMany; i++)
		{
			ans =num1+num2;
			System.out.print(" , " + ans);
			num1=num2;
			num2=ans;
		}	
	}
	public static void main(String[] args) {
		int cnt;
		FibonnacciDemo fibo = new FibonnacciDemo();
		Scanner sc = new Scanner(System.in);
		cnt = sc.nextInt() ;
		
		System.out.print("\nGenerating Fibonnacci series");
		System.out.println("==================================================\n");
		System.out.print("Enter the count ");
		
		
		if (cnt>0){
			fibo.generateFibonacci(cnt);
		}
		else
		{
			System.out.print("Number must be greeater then 0");
		}
		sc.close();
	}
}
