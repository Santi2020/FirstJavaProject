package day7;

class Parent
{
	int a;
	
	void display()
	{
		System.out.println("Inside parent class. a =" +a );
	}
}


class Child1 extends Parent
{
	int c1;
	void show()
	{
		System.out.println("Inside child1 class. c1 =" +c1 );
	}
	
}


class Child2 extends Parent
{
	int c2;
	void print()
	{
		System.out.println("Inside child2 class. c2 =" +c2 );
	}
}


public class HierarchyDemo {	
	public static void main(String[] args) 
	{
		//child1 c1obj = new child1();
		
		Child1 c1obj =new Child1();
		c1obj.a=11111;
		c1obj.c1=2;
		c1obj.display();
		c1obj.show();
		
		
		Child2 ch2 = new Child2();
		ch2.a = 108;
		ch2.c2 = 1008;
		ch2.display();
		ch2.print();
		
	}
}
