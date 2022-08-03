package day3;

public class PrintTables {

	public static void main(String[] args) {
		int tab=5;
		for (int i=1;i<=10;i++)
		{
			System.out.println(""+tab +" * " +i +" = " + (tab*i) );
		}
		
		
		System.out.println("Check wheather the number is +ve or -ve" );
		int num = 0;
		if (num>0)
		{
			System.out.println("Positive number" );
		}
		else if (num<0)
		{
			System.out.println("Negative number" );
		}
		else
		{
			System.out.println("Its a Zero");
		}
			
		//System.out.println("");
		System.out.println("Largest of three numbers");
		int num1=16;
		int num2 = 100;
		int num3 = 100;
		if (num1>num2 && num1>num3)
		{
			System.out.println("Num1 " +num1 +" is greatest");
		}
		else if (num2>num1 && num2>num3)
			{
				System.out.println("Num2 " +num2 +" is greatest");
			}
		else
		{
			System.out.println("Num3 " +num3 +" is greatest");
		}
		
		
		System.out.println("\nCount the number of digits in the number");
		int dig =1772345;
		String str ;
		str=Integer.toString(dig);
		System.out.println("Length of  " +dig +" is " +str.length());
		
	//End	
	}
}
