package day4;

public class StringAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Java";
		String str2 = "java1";
		String str3 = "abc@gmail.com";
		
		//Comapre two string ignore case
		System.out.println("");
		System.out.println("String comparision result is "+ str1.equalsIgnoreCase(str2) );
		
		
		System.out.println("After Concatenation  =  " + str1.concat( str2) );
		System.out.println("Length of string " +str1.length() );
		
		System.out.println("indexOf =" + str3.indexOf('@') );
		System.out.println("indexOf =" + str3.substring(str3.indexOf("@")+1,str3.length()) );

		System.out.println("uppercase =" + str3.toUpperCase() );
		System.out.println("uppercase =" + str3.toLowerCase() );
	} ///---end

}
