package day5;

public class Calculation {
	int x=10;
	int y = 20;
	
	
	void sum()
	{
		System.out.println(x+y);
	}
	
	
	int sum2()
	{
		return x+y;
	}
	
	
	void sum3(int a, int b)
	{
		x=a;
		y=b;
		System.out.println(x+y);
	}
	
	int sum4(int a, int b)
	{
		x=a;
		y=b;
		return (x+y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation cal = new Calculation();
		int res;
		cal.sum();
		res = cal.sum2();
		System.out.println(res);
		
		
		cal.sum3(200,900);
		res = cal.sum4(23,45);
		System.out.println(res);
	}

}
