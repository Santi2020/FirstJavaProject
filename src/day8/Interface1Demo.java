package day8;

interface A
{
	int num =340 ;
	void m1();
	//void m2();
}

public class Interface1Demo implements A 
{
	public void m1()
	{
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		Interface1Demo infDemo = new Interface1Demo();
		infDemo.m1();
		
	}

}
