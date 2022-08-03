package day5;

public class Calculate {
	int num1;
	int num2;
	int num3;
	
	Calculate()
	{
		num1=100;
		num2=444;
		num3= 222;
	}
	
	int sum()
	{
		return (num1+num2+num3);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculate cal = new Calculate();
		System.out.println(cal.sum());
		
	}

}
