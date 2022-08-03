package day8;

class A1
{
	void m1()
	{ 
		System.out.println("This is in class A1 amd method m1");
	}
}

	
interface B1
{
	void m2();
}

interface B2 
{
	void m3();
}

public class HybridInheritance extends A1 implements B1,B2 
{
	public void m2()
	{
		System.out.println("Implementation of m2 in child class from B1 interface");
	}
	
	public void m3()
	{
		System.out.println("Implementation of m2 in child class  from B2 interface");
	}
	
	
	public static void main(String[] args) {
		HybridInheritance hy = new HybridInheritance();
		hy.m1();
		hy.m2();
		hy.m3();

	}

}
