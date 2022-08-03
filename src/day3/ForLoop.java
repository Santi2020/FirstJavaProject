package day3;

public class ForLoop {

	public static void main(String[] args) {
		int i, j;
		for( i=1; i<=10; i++)
		{
			System.out.println(i);
		}
		
		for(i =10; i>0; i--)
		{
			for(j=1; j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
