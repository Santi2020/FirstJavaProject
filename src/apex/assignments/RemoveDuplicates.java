//5.	Remove Duplicates from Sorted Array
package apex.assignments;

public class RemoveDuplicates {
	public void displayArray(int[] arr) {
		System.out.println("Diplaying values of the array");
		for (int n : arr)
			System.out.print(" " + n);
		System.out.println("\n=============================================");
	}
	
	public void deDuplicateArray(int[] arrOfInt) {
		int lenOfArray = arrOfInt.length;
		
		
		int[] newArr= new int[lenOfArray];
		int idx=0;
		
		displayArray(arrOfInt);
		
		System.out.println("");
		for(int i=0; i<arrOfInt.length-1; i++) {
			if (arrOfInt[i]!= arrOfInt[i+1]) {
				newArr[idx++] = arrOfInt[i];
			}
		}
		
		//Now addint the last element to the list
		newArr[idx] = arrOfInt[arrOfInt.length-1];
		
		System.out.println("\nAfter deduplication");
		displayArray(newArr);
				
	}
	
	public static void main(String[] args) {
		int[] arrInt1= {1,1,4,4,5,7,8,9,10,10,13};
		//int[] arrInt1= {1,1,1};
		RemoveDuplicates rmDup = new RemoveDuplicates();
		rmDup.deDuplicateArray(arrInt1);
	}

}
