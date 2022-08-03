package day8;

interface AB
{
	int a=100;
	int b=1000;
	void sum();
}




public class InterfaceDemo implements AB
{
	public void sum()
	{
		System.out.println("Sum = "+(a+b));
	}
	
	
	public static void main(String[] args) {
		InterfaceDemo inf = new InterfaceDemo();
		inf.sum();
	}

}
