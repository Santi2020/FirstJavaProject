//4.	Find the contiguous sub array within an array which has the largest sum
package apex.assignments;

public class SubArraySum {
	public int getLargestSubArraySum(int[] arrInt) {
		int maxSum=0;
		int curSum=0;
		int prevSum =0;
		
		System.out.print("\nDispalying the arry");
		for (int n :arrInt)
			System.out.print(" , " + n);
		
		for (int i=0; i<arrInt.length; i++) {
			curSum = curSum + arrInt[i];
			if (maxSum < curSum) {
				maxSum=curSum;
			}
			if(prevSum>curSum) {
				prevSum=0;
				curSum=0;
			}else {
				prevSum=curSum;
			}			
		}
		return maxSum;
	}
	
	public static void main(String[] args) {
		int sum ;
		SubArraySum sub = new SubArraySum();
		
		int[] arrofInt1 = {2,5,-1,3,-10,4,-15,2,-8};
		sum = sub.getLargestSubArraySum(arrofInt1);
		System.out.println("\nLargest subarray Sum= " + sum);
		System.out.println("====================================================\n" );
		
		
		
		int[] arrofInt2 = {2,5,1,3,-10,4,15,12,-18};
		sum = sub.getLargestSubArraySum(arrofInt2);
		System.out.println("\nLargest subarray Sum= " + sum);
		System.out.println("====================================================\n" );
	}

}
