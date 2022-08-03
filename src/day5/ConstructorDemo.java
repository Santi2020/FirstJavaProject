package day5;

public class ConstructorDemo {
	int x;
	int y;
	ConstructorDemo()
	{
		x=100;
		y=90;
	}
	
	
	ConstructorDemo(int a, int b)
	{
		x=a;
		y=b;
	}
	
	
	void display()
	{
		System.out.println(x+y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo demo = new ConstructorDemo();
		demo.display();
		
		
		ConstructorDemo demo1 = new ConstructorDemo(111,222);
		demo1.display();
		
	}

}
