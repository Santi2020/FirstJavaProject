package day6;

public class StaticDemo {
	static int a=10;
	int b =20;
	
	static void m1()
	{
		
		System.out.println("This is m1 static method");
	}
	
	void m2()
	{
		System.out.println("This is m2 non static method");
	}
	
	void m3()
	{
		a=100;
		b=200;
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(a);
		m1();
		
		//System.out.println(b);
		//m2();
		
		StaticDemo sd = new StaticDemo();
		System.out.println( sd.b);
		sd.m2();
		System.out.println("======Calling Non statis method======");
		sd.m3();
		
		System.out.println("======Calling statis method from main======");
		System.out.println(a);
		m1();
	}

}
