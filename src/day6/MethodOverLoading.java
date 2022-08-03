package day6;

public class MethodOverLoading {
	
	void add(int a , int b)
	{
		System.out.println(a+b);
	}
	
	void add(int a , int b, int c)
	{
		System.out.println(a+b+c);
	}
	
	
	void add(int a , double b)
	{
		System.out.println(a+b);
	}
	
	void add(double a , double b)
	{
		System.out.println(a+b);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverLoading mol = new MethodOverLoading();
		int num1 = 100;
		int num2 = 300;
		int num3 =200;
		double d1= 12.23;
		double d2 = 123.99;
		System.out.println("===================");
		mol.add(num1,num2);
		
		mol.add(num1,num2,num3);
		
		mol.add(num1,d1);
		
		mol.add(d1,d2);
		
		
	}

}
