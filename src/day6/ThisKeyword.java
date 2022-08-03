package day6;

public class ThisKeyword {
	int a;
	int b;
	
	void getValues(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	
	void printValues()
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyword tk = new ThisKeyword();
		tk.getValues(10, 14);
		tk.printValues();
	}

}
