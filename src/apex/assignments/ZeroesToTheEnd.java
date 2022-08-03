package apex.assignments;

import java.util.Scanner;

public class ZeroesToTheEnd {
	
	public void moveZeroes(int[] arrInt) {
		int temp;
		int count=0;
		for(int i=0;i<arrInt.length; i++) {
			if(arrInt[i] != 0) {
				temp=arrInt[count];
				arrInt[count]=arrInt[i];
				arrInt[i]=temp;
				count=count+1;
			}
		}
	}
	
	
	public void printArray(int[] arrInt) {
		for (int i : arrInt)
			System.out.print(" " + i);
	}
	
	public static void main(String[] args) {
	
		int[] arrInt = {1,2,0,0,0,4,5,6};
		ZeroesToTheEnd zeroes = new ZeroesToTheEnd();
		System.out.println("\nArray Values before moving the zeroes."); 
		zeroes.printArray(arrInt);
		zeroes.moveZeroes(arrInt);
		System.out.println("\nArray Values After moving the zeroes.");
		zeroes.printArray(arrInt);
	}

}
