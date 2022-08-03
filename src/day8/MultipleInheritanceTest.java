package day8;


interface ABC
{
	int a =100;
	void m1();
}

interface XYZ
{
	int x = 123;
	void m2();
}


public class MultipleInheritanceTest implements ABC, XYZ 
{
	public void m1()
	{
		System.out.println(a);
	}
	
	public void m2()
	{
		System.out.println(a);
	}
	public static void main(String[] args) {
		MultipleInheritanceTest mitest = new MultipleInheritanceTest();
		mitest.m1();
		mitest.m2();
		

	}

}
