package day6;

public class OverLoadMainMethod {
	public void main(int a)
	{
		System.out.println(a);
	}
	
	public void main(int a, int b)
	{
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoadMainMethod om = new OverLoadMainMethod();
		om.main(10);
		om.main(10,30);
	}

}
