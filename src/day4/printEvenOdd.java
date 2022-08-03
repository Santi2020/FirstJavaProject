package day4;

public class printEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,23,54,27,56};
		//int val;
		for( int val: arr)
		{
			if (val%2==0) {
				System.out.println("" +val +" is even number");
			}
			else
			{
				System.out.println("" +val +" is odd number");
			}
			
			System.out.println("\n===== ODD number=====");
			for(int val1 : arr)
			{
				if (val1%2 !=0)
				{
					System.out.println("" +val1 +" is odd number");
				}
			}
			
			
			System.out.println("\n===== Even number=====");
			for(int val2 : arr)
			{
				if (val2%2 ==0)
				{
					System.out.println("" +val2 +" is Even number");
				}
			}
			
			
			
		} //---

	}

}
