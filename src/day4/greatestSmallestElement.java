package day4;

public class greatestSmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,23,5445,1,12};
		int greatest = arr[0];
		int smallest = arr[0];
		
		for(int val :arr)
		{
			if (val > greatest)
			{
				greatest = val;
			}
		}
		
		System.out.println("Greatest value is " +greatest);
		
		for(int val :arr)
		{
			if (val < smallest)
			{
				smallest = val;
			}
		}
		
		System.out.println("smallest value is " +smallest);


	}

}
