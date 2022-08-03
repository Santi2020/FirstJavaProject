package day3;

public class JumpStatements {

	public static void main(String[] args) {
		int i;
		for(i=1;i<=10;i++)
		{
			System.out.println("I = " + i);
			if (i==5)
			{
				System.out.println("Breaking");
				break;
			}
		}
		
		System.out.println("Continue statement" );
		for(i=1;i<=10;i++)
		{
			
			if (i==5 || i==3 || i==7)
			{
				System.out.println("Continuing");
				continue;
			}
			System.out.println("I = " + i);
		}
	}

}
