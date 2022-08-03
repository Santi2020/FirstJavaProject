package day7;


 class bike
{
	final void run()
	{
		System.out.println("Biking");
	}
}

class Honda extends bike
{
	void run1()
	{
		System.out.println("Honda");
	}	
}

public class FinalMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Honda h = new Honda();
		h.run();
	}

}
