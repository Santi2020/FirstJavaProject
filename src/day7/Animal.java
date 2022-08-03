package day7;

public class Animal {
	String color = "White";
	
	Animal()
	{
		System.out.println("Animal is created");
	}
	void eating()
	{
		System.out.println("Parent eating......");
	}
	
}


class Dog extends Animal
{
	String color ="Black";
	
	Dog()
	{
		super();
		System.out.println("Dog 1 is created");
	}
	void displayColor()
	{
		System.out.println(color);
		//System.out.println(super.color);
		
	}
	
	void eating()
	{
		//super();
		System.out.println("Child eating......");
		super.eating();
	}
}