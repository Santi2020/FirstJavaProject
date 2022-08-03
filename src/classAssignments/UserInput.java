package classAssignments;

import java.util.Scanner;

public class UserInput {
	
	public static int addNumbers(int a, int b)
	{
		return (a+b);
	}
	
	
	public static int subtract(int num1, int num2)
	{
		return (num2-num1);
	}
	
	public static int mul(int num1, int num2)
	{
		return (num1* num2);
	}
	
	public static int div(int num1, int num2)
	{
		return (num1/num2);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("User has to input 2 numbers : ");
		int num1 = 20;
		int num2 = 10 ;
		int result = 0;
		int operation = 0;
		System.out.println("Enter 1st number :");
		num1 = sc.nextInt();
		
		System.out.println("Enter 2nd number :");
		num2 = sc.nextInt();

		System.out.println("You entered " + num1 +" , " + num2);	
		System.out.println("Select one operation \n1. Addition \n2. Subtraction \n3. Multiplication \n4. Division" );
		
		operation = sc.nextInt();
		
		System.out.println("operator = " + operation);
		
		switch(operation)
		{
		case 1:
		{
			System.out.println("case 1");
			result = addNumbers(num1,num2);
			break;
		}	
		case 2:
		{
			System.out.println("case 2");
			result = subtract(num1,num2);
			break;
		}
		case 3 :
		{
			System.out.println("case 3");
			result = mul(num1, num2);
			break;
		}
		case 4 :
		{
			System.out.println("case 4");
			result = div(num1,num2);
			break;
		}
		}
		System.out.println("Result = " + result);
		sc.close();
	}
}
