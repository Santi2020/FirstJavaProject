package day3;

public class WhileLoop {

	public static void main(String[] args) {
		int ctr=1;
		while(ctr<=10)
		{
			System.out.println(ctr);
			ctr++;
		}
		
		System.out.println("====even numbers=====");
		//Print even numbers between 1 to 10
		ctr=1;
		while(ctr<=10)
		{
			if (ctr%2==0)
			{
				System.out.println(ctr);
			}
			ctr++;
		}
		
		System.out.println("====odd numbers=====");

		//Print odd numbers
		ctr=1;
		while(ctr<=10)
		{
			System.out.println(ctr);
			ctr+=2;
		}
		
		
		
		System.out.println("====Descending order=====");

		//Print descending order
		ctr=10;
		while(ctr>=1)
		{
			System.out.println(ctr);
			ctr--;
		}
	}

}
