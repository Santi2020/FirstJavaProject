package day9;

public class ExceptionExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		int a =90;
		String s = null;
		String n = "123";
		int num = Integer.parseInt(n);
		
		int arr[] = new int[5];
		
		arr[1]=12;
		
		System.out.println("");
		
		System.out.println("Program started");
		System.out.println("In progress");
		
		try
		{
			System.out.println(a/2);
		}
		catch (ArithmeticException e)
		{
			System.out.println("Arithematic exception occurred");
		}
		
		try
		{
		System.out.println("Length of S = " + (s.length()));
		}
		catch(
				Exception e)
		{
			System.out.println("Exception occured " + e.getMessage());
		}
		finally
		{
			System.out.println("Entered into finally block");
		}
		
		try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Thread.sleep(9000);
		
		System.out.println("Program ended");
		System.out.println("Ending");
		
	}

}
