package day7;

class A
{
	int a;
	void display()
	{
		System.out.println(a);
	}
}

class B extends A
{
	int b;
	
	void print()
	{
		System.out.println(b);
	}
	
}

class C extends B
{
	int c;
	
	void print_c()
	{
			System.out.println(c);
	}
}


public class nheritanceDemo {

	public static void main(String[] args) {
		
		A a_obj = new A();
		a_obj.a =100;
		a_obj.display();
		
		B b_obj = new B();
		b_obj.b=11;
		b_obj.a=22;
		b_obj.display();
		b_obj.print();
		
		
		C c_obj = new C();
		c_obj.a= 999;
		c_obj.b =888;
		c_obj.c = 777;
		c_obj.display();
		c_obj.print();
		c_obj.print_c();
		
	}

}
