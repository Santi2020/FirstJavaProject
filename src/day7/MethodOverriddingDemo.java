package day7;

class Bank
{
	double rateOfInterest()
	{
		return 0;
	}
}

class SBI extends Bank
{
	double rateOfInterest()
	{
		return 10.8;
	}
}

class ICICI extends Bank
{
	double rateOfInterest()
	{
		return 9.7;
	}
}

class AXIS extends Bank
{
	double rateOfInterest()
	{
		return 8.5;
	}
}


public class MethodOverriddingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI sbjObj =new SBI();
		System.out.println(sbjObj.rateOfInterest());
		
		
		ICICI iciciObj = new ICICI();
		System.out.println(iciciObj.rateOfInterest());
		
		AXIS axisObj = new AXIS();
		System.out.println(axisObj.rateOfInterest());
	}

}
