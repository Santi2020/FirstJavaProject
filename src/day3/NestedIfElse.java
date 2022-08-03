package day3;

public class NestedIfElse {

	public static void main(String[] args) {
		int num = 10;
		if ((num>=1) && (num <=7))
		{
			if (num==1) {
				System.out.println("Monday");
			}
			else if(num ==2)
			{
				System.out.println("Tuesday");
			}
			else if (num==3)
			{
				System.out.println("Wednesday");
			}
			
			else if (num==4)
			{
				System.out.println("Thursday");
			}
			else if (num==5)
			{
				System.out.println("Friday");
			}
			else if (num==6)
			{
				System.out.println("Saturday");
			}
			else 
			{
				System.out.println("Sunday");
			}
		}	
		else
			{
				System.out.println("Invalid day");
			}
	} //static void end

}
