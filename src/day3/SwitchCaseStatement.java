package day3;

public class SwitchCaseStatement {

	public static void main(String[] args) {
		int day =72;
		String str = "Sunday";
		switch(str)
		{
		case "Monday": System.out.println("Monday");
			break;
		case "Sunday" : System.out.println("Sunday");
			break;
		default: 	System.out.println("Invalid weekday");
		}
		
		
		switch(day)
		{
		case 1: System.out.println("Monday");
			break;
		case 2 : System.out.println("Tueday");
			break;
		case 3:	System.out.println("Wednesday");
			break;
		case 4: System.out.println("Thursday");
			break;
		case 5: System.out.println("Friday");
			break;
		case 6: System.out.println("Saturday");
			break;
		case 7: System.out.println("Sunday");
			break;	
		default: System.out.println("Invalid week number");
		}
	}

}
