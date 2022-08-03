package day4;

public class SingleDimArray {

	public static void main(String[] args) {
		int a[] = new int[5];
		a[0]= 100;
		a[2]= 200;
		a[3]= 300;
		a[4]= 400;
		a[1]=1000;
		
		for (int i =0; i<=4; i++)
		{
			System.out.println(a[i]);
		}
		
		
		int dynArray[]= {1,2,3,4,5};
		for(int i =0; i<dynArray.length; i++)
		{
			System.out.println(dynArray[i]);
		}
		
		
		//Enhanced for loop
		System.out.println("\n\nEnhanced for loop");
		for (int i:dynArray)
		{
			System.out.println(i);
		}
		
	}//-------------

}
