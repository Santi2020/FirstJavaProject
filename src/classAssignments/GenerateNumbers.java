/*
 * Generate following
Generate 1000 numbers
Generate multiple of 5 and less than 1000
Generate odd numbers up to 1000

 */
package classAssignments;

public class GenerateNumbers {
	
	public void generateNum(int num)
	{
		for(int i =1; i<=num; i++)
		{
			System.out.print(i + "," );
		}
	}
	
	public void multiplesOf5(int num)
	{
		int res =5;
		while(true)
		{
			if (res <=num)
			{
				System.out.println(res);
				res+=5;
			}
			else
			{
				break;
			}
		}
	}
	
	public void generateOddNumbers(int num)
	{
		for (int i =1;i<=num; i++)
		{
			if ((i%2)!=0)
			{
				System.out.print(i + " , ");
			}
		}
	}
	public static void main(String[] args)
	{
		int n =100;
		GenerateNumbers gen = new GenerateNumbers(); 
		System.out.print("\nGenerating numbers\n");
		gen.generateNum(n);
		System.out.print("\n\n\n\nMultiples of 5\n");
		gen.multiplesOf5(n);
		
		System.out.print("\n\n\n\nGeneratint ODD numbers\n");
		gen.generateOddNumbers(n);
	}
}
