/*
  Write a class BasicCalulator.java to provide basic mathematical operation like 
  additional, subtractions, multiplications, and division for two numbers. 
  Write a client to use above class and call its operations.
 */
package classAssignments;

import java.util.Scanner;

public class CalculatorDemo {
	
	public int addition(int num1, int num2)
	{
		return( num1+num2);
	}
	
	public int subtraction(int num1, int num2)
	{
		return (num1-num2);
	}
	
	
	public int multiplication(int num1, int num2)
	{
		return (num1* num2);
	}
	
	public float division(int num1, int num2)
	{
		return (num1/num2);
	}
	
	
	public static void main(String[] args) {
		CalculatorDemo cal = new CalculatorDemo();
		
		Scanner sc = new Scanner (System.in);
		int n1;
		int n2;
		System.out.print("Enter !st number : ");
		n1 = sc.nextInt();
		
		System.out.print("Enter !st number : ");
		n2 = sc.nextInt();
		
		String operator;
		System.out.print("Select the operation :\n1. Add\n2. Subtract\n3. Multiply \n4.Division ");
		operator = sc.next();
		
		int ans ;
		float floatans;
		switch(operator)
		{
		case "add":
			System.out.println("Inside Add case");
			ans= cal.addition(n1,n2);
			System.out.println("Result = " + ans);
			break;
		case "subtract":	
			System.out.println("Inside subtract case");
			ans= cal.subtraction(n1,n2);
			System.out.println("Result = " + ans);
			break;
			
		case "multiply":	
			System.out.println("Inside subtract case");
			ans= cal.multiplication(n1,n2);
			System.out.println("Result = " + ans);
			break;	
		case "division":	
			System.out.println("Inside subtract case");
			floatans= cal.division(n1,n2);
			System.out.println("Result = " + floatans);
			break;	
		}
	}

}




