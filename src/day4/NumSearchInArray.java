package day4;

public class NumSearchInArray {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int numSearch =30;
		boolean flag = false;
		for (int val:arr)
		{
			if (val == numSearch)
			{
				System.out.println("Elementfound = " +val);
				flag= true;
				break;
			}
		}
		
		if (!flag)
		{
			System.out.println("Element NOT found " );
		}
		
	}

}
