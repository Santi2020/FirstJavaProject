package day6;

public class ConstructorOverLoading {
	ConstructorOverLoading(int a, int b)
	{
		System.out.println(a+b);
	}
	
	ConstructorOverLoading(int a, double b)
	{
		System.out.println(a+b);
	}
	
	ConstructorOverLoading(double a, int b)
	{
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorOverLoading col1 = new ConstructorOverLoading(10,20);
		
		ConstructorOverLoading col2 = new ConstructorOverLoading(10,20.33);
		
		ConstructorOverLoading col3 = new ConstructorOverLoading(10.89,20);
		
	}

}
