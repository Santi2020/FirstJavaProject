package apex.assignments;

//3.	Given an unsorted array of integers, 
//find the length of the longest consecutive elements sequence.

public class LenOfLongestConsecutiveElements {
	public int getlongestConsecutive(int[] arr) {
		
		int maxCount=1;
		int currCount=1;

		System.out.println("Displaying the contents for array");
		for(int i : arr)
			System.out.print(i +",");
		
		for (int i=0 ; i<arr.length-1; i++ ){
			if (arr[i+1]==arr[i]+1) {
				currCount+=1;
				continue;
			}
			else {
				if (maxCount< currCount) {
					maxCount=currCount;
				}
				currCount=1;
			}	
		}
		
		if (maxCount< currCount) {
			maxCount=currCount;
		}
		return maxCount;
	}

	public static void main(String[] args) {
		int count;
		LenOfLongestConsecutiveElements lenConsec = new LenOfLongestConsecutiveElements();
		
		int[] arrOfNum = {0,3,4,19,23,4,5,6,7,8,16,17,18,19,20,21,22, 6};
		count=lenConsec.getlongestConsecutive(arrOfNum);
		System.out.println("\nLength of longest consecutive element sequence is " + count);
		System.out.println("\n======================================================\n");
		
		int[] arrOfNum1 = {0,3,22, 6};
		count =lenConsec.getlongestConsecutive(arrOfNum1);
		System.out.println("\nLength of longest consecutive element sequence is " + count);
		System.out.println("\n======================================================\n");
	}

}
