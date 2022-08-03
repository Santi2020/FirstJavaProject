package corejava;

import java.util.Date;
import java.util.Date;
import java.util.Date;

public class Datatype {
	int numint;
	byte numByte;
	long numLong;
	short numShort;
	char chr;
	float numFloat;
	double numDouble;
	boolean bool;
	String str;
	Date dt;
	
	public void printAll() {
		System.out.println("Value of numint=" +numint);
		System.out.println("Value of numByte=" +numByte);
		System.out.println("Value of numLong=" +numLong);
		System.out.println("Value of numShort=" +numShort);
		if (chr == ' ') {
			System.out.println("Value of chr is null");
		}
		else {
		System.out.println("Value of chr=" +chr);
		}
		
		System.out.println("Value of numFloat=" +numFloat);
		System.out.println("Value of numDouble=" +numDouble);
		System.out.println("Value of bool=" +bool);
		System.out.println("Value of str=" +str);
		System.out.println("Value of dt=" +dt);
	}
	
	
	
	public void animalSound() {
	    System.out.println("No parameter");
	}
	
	public void animalSound(String dog) {
	    System.out.println("One paramente parameter dog=" + dog);
	}
	
	public void animalSound(String dog, int age) {
	    System.out.println("Two paramente parameter dog=" + dog + " age = " + age);
	}
	
	
	
	
	public static final void main(String[] args) {
		Datatype d = new Datatype();
		d.printAll();
		
		InheritanceFinalDemo obj = new InheritanceFinalDemo();
		System.out.println("=======================");
		System.out.println("Value of num =" + obj.num);
		System.out.println("=======================");
		
		
		d.animalSound();
		d.animalSound("Animal");
		d.animalSound("Tiger", 15);
		
	}
	

}
