/*
 * 
 * 
4 .Write a java program with following methods: 
public Boolean IsInteger(String str)
public Boolean IsOddNumber(String str)
public Boolean IsEvenNumber(String str)
public Boolean IsPrimeNumber(String str)

 */
package classAssignments;

import java.util.Scanner;

public class CheckNumber {

	public Boolean isInteger(String str)
	{
		try
		{
			Integer.parseInt(str);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public Boolean isOddNumber(String str)
	{
		int num;
		try
		{
			num = Integer.parseInt(str);
			if ((num%2)==0)
			{
				return false;
			}
			else
			{
				return true;
			}
		}
		catch(Exception e)
		{
			System.out.println("Not a number");
			return false;
		}
	}
	
	
	public Boolean isEvenNumber(String str)
	{
		int num;
		try
		{
			num = Integer.parseInt(str);
			if ((num%2)==0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(Exception e)
		{
			System.out.println("Not a number");
			return false;
		}
	}
	
	
	public boolean isPrimeNumber(String str)
	{
		int num;
		try
		{
			num = Integer.parseInt(str);
			for (int i =2; i<=(num/2);i++)
			{
				
				if ((num%i)==0)
				{
					return false;
				}
				System.out.println("i =" +i + " " +num + "%" +i  +" = " +(num%i));
			}
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Not a number");
			return false;
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CheckNumber chk = new CheckNumber();
		String myValue;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value : ");
		myValue = sc.nextLine();
		if (chk.isInteger(myValue))
		{
			System.out.println(myValue + " is a number : ");
		}
		else
		{
			System.out.println(myValue + " is not a number : ");
		}	
		
		//Check if the input value is odd number
		if (chk.isOddNumber(myValue))
		{
			System.out.println(myValue + " is a odd number : ");
		}
		else
		{
			System.out.println(myValue + " is not a Odd number : ");
		}
		
		
		//Check if the input value is odd number
		if (chk.isEvenNumber(myValue))
		{
			System.out.println(myValue + " is Even number : ");
		}
		else
		{
			System.out.println(myValue + " is not a even number : ");
		}
		
		//Check if the input value is odd number
		if (chk.isPrimeNumber(myValue))
		{
			System.out.println(myValue + " is a Prime number : ");
		}
		else
		{
			System.out.println(myValue + " is not a prime number : ");
		}
		
	}

}
