package day8;

interface A_mul
{
	int a = 5;
	int b = 9;
	void add();
}

interface B_mul
{
	int x= 12;
	int y=23;
	void mul();
}


public class MultipleInheritance implements A_mul,B_mul 
{

	public void add()
	{
		System.out.println("Sum = " +(a+b));
	}
	
	public void mul()
	{
		System.out.println("Mul = " +(x*y));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInheritance mi = new MultipleInheritance();
		mi.add();
		mi.mul();
	}

}
