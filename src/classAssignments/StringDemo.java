package classAssignments;

public class StringDemo {

	
	public static void main(String[] args) {
		String str1="Santoshi";
		String str2="Santoshi";
		if (str1==str2)
		{
			System.out.println("1st case Both Strings are same");
		}
		
		if (str1.equals(str2) )
		{
			System.out.println("2nd case Both Strings are same");
		}
		
		
		System.out.println("str1 =" + str1);
		System.out.println("str2 =" + str2);
		str1="tambe";
		System.out.println("str1 =" + str1);
		System.out.println("str2 =" + str2);
	}
	
}
