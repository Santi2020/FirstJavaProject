package classAssignments;

import java.sql.Connection;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmployeeValidation {
	String userID;
	String firstName;
	String email;
	String HomeAddress;
	String city;
	String zipCode;
	String month;
	String day;
	
	
	public EmployeeValidation(String userID ,String firstName,String email,String HomeAddress, String city, String zipCode,	String month,	String day)
	{
		this.userID = userID;
		this.firstName = firstName;
		this.email = email;
		this.HomeAddress = HomeAddress;
		this.city = city;
		this.zipCode=zipCode;
		this.month = month;
		this.day = day;
	}
	
	public boolean isNullcheck(String val)
	{
		//if (val.isBlank())
		
		//System.out.println("val = " +val.length());
		
		if (val.length() ==0)
		{
			return true;
		}
		return false;
	}
	
	public boolean checkSpecialchars(String val)
	{
		char[] chr = {'!', '@','#','$','%','^' ,'&', '*', '(',')','-','+','='};	
		for (int i=0; i<chr.length;i++)
		{
			if (val.indexOf(chr[i])==1 )
			{
				return true;
			}
		}
		return false;
	}
	
	
	public boolean SpCharsinUserID(String val)
	{
		Pattern p = Pattern.compile("[^a-z0-9_]" ,  Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(val);
		boolean res =m.find();
		//System.out.println("res = " +res);
		if (res)
		{
			//System.out.println(sname + " contains special chars");
			return true;
		}
		else
		{
			//System.out.println(val + " contains NO special chars");
			return false;
		}
	}
	
	public boolean validZip(String val)
	{
		Pattern p = Pattern.compile("[0-9]");
		Matcher m = p.matcher(val);
		boolean res =m.find();
		if (res)
		{
			//returns true if sp chars found
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean spChars(String val)
	{
		Pattern p = Pattern.compile("[^a-zA-Z0-9 -_]" ,  Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(val);
		boolean res =m.find();
		System.out.println("res = " +res);
		if (res)
		{
			//System.out.println(sname + " contains special chars");
			return true;
		}
		else
		{
			//System.out.println(val + " contains NO special chars");
			return false;
		}
	}
	
	public boolean dbcheck(String val)
	{
		//Connection con="";
		//Statement stmt="";
		//String sql ="SELECT 1 FROM EMPLOYEE WHERE EMPID =" + userID;
		if (true)
		{
			return true;
		}
		return false;
	}
	
	public boolean checkUserID(String userID) {
		System.out.println("userID = " +userID);
		//if (isNullcheck(userID))
		
		if (userID.isBlank())
		{
			System.out.println("HRMS_R0001: Please choose a user id for your account " );
			return false;
		}
		
		if (SpCharsinUserID(userID))
		{
			System.out.println("HRMS_R0002: Used ID must start with a letter. It can contain only letters, numbers, and underscores (_). Please enter a valid User ID. " + userID);
			return false;
		}
		
		if ((userID.length()<6) || (userID.length()>15))
		{
			System.out.println("HRMS_R0003: The User ID must be 6 to 15 characters. Please check and enter a valid User ID. " + userID);
			return false;
		}
		
		/*
		if (dbcheck(userID))
		{
			System.out.println("HRMS_R0004: The User Id you provided has already been used. Please Choose other User ID.");
			return false;
		}
		*/	
	return true;		
	}

	public boolean checkFirstName(String firstName) {
		System.out.println("Firstname = " + firstName);
		//if (isNullcheck(firstName))
		
		if (firstName.isBlank())
		{
			System.out.println("HRMS_R0009: Please specify First Name." );
			return false;
		}
		
		if (spChars(firstName))
		{
			System.out.println("HRMS_R0010: First Name must start with a letter. It can contain only letters, numbers, and Spaces, Hyphens (-), Underscores (_). Please enter a valid First Name. " + firstName);
			return false;
		}
		
		if (firstName.length()<2)
		{
			System.out.println("HRMS_R0011: The Firstt Name is less than 2 characters. Please Check and enter a valid First Name" );
			return false;
		}
		
		return true;
	}
	
	public boolean checkEmail(String email) {
		System.out.println("email = " +email);
		//if (isNullcheck(email))
		if (email.isBlank()){
			System.out.println("HRMS_R0016: Please specify Email Address" );
			return false;
		}
		
		if ((email.contains("@"))!=true)
		{
			System.out.println("HRMS_R0017: Invalid Address. for eg: a@b.com" );
			return false;
		}
		
		if (email.length()>50)
		{
			System.out.println("HRMS_R0017: exceeded Maximum length" );
			return false;
		}
		
		return true;
	}

	public boolean checkHomeAddress(String homeAddress) {
		System.out.println("homeAddress = " +homeAddress);
		if (isNullcheck(homeAddress))
		{
			System.out.println("HRMS_R0018: Please specify Home Address" );
			return false;
		}
		return true;
	}

	public boolean checkCity(String city) {
		System.out.println("city = " +city);
		if (isNullcheck(city))
		{
			System.out.println("HRMS_R0019: Please specify city" );
			return false;
		}
		
		if (spChars(city))
		{
			System.out.println("HRMS_R0018: City can contain only letters, numbers, and Spaces, Hyphens (-), underscores (_). Please enter a valid City." + city);
			return false;
		}
		
		
		return true;
	}

	public boolean checkZipCode(String zipCode) {
		System.out.println("zipCode = " + zipCode);
		
		if (validZip(zipCode))
		{
			System.out.println("HRMS_R0022: Zip Code contains 5 digits. Please enter a valid Zip Code." + zipCode);
			return false;
		}
		return true;
	}
	public boolean checkMonth(String month) {
		System.out.println("month = " +month);
		if (isNullcheck(month))
		{
			System.out.println("HRMS_R0020: Please specify month" );
			return false;
		}
		return true;

	}

	public boolean checkDay(String day) {
		System.out.println("day = " +day);
		if (isNullcheck(day))
		{
			System.out.println("HRMS_R0020: Please specify month" );
			return false;
		}
		return true;

	}

	
	public void specialcheck()
	{
		// Declaring and initializing strings randomly
        // with input characters
 
        // Custom Input as String 1
        String s1 = "GeeksForGeeks";
        System.out.println("------------------------\n"+s1);
        // Creating regex pattern by
        // creating object of Pattern class
        Pattern p = Pattern.compile(
            "[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
 
        // Creating matcher for above pattern on our string
        Matcher m = p.matcher(s1);
 
        // Now finding the matches for which
        // let us set a boolean flag and
        // imposing find() method
        boolean res = m.find();
 
        // Output will be based on boolean flag
 
        // If special characters are found
        if (res)
 
            // Display this message on the console
            System.out.println(
                "String1 contains Special Characters");
 
        // If we reach here means no special characters are
        // found
        else
 
            // Display this message on the console
            System.out.println(
                "No Special Characters found in String 1");
 
        // Custom Input as String 2
        String s2 = "!!Geeks.For.Geeks##";
        System.out.println("----------------------------------\n" +s2);
        // Creating matcher for above pattern on our string
        // by creating object of matcher class
        Matcher m2 = p.matcher(s2);
 
        // Finding the matches using find() method
        boolean res2 = m2.find();
 
        // If matches boolean returns true
        if (res2)
 
            // Then print and display thta special
            // characters are found
            System.out.println(
                "String 2 contains Special Characters");
 
        // If not
        else
 
            // Then Display the print statement below
            System.out.println(
                "No Special Characters found in String 2");
    }

	
	public String toString()
	{
		return "[Userid = '" + userID +"' , Firstname ='" + firstName +"' Email = '" + email + "' Address = '" + HomeAddress +"' City = '" + city + "' Month = '" + month +"' Day = '" +day  +"']";
	}
	public static void main(String[] args) {
		
		EmployeeValidation emp = new EmployeeValidation("USER001","Simba","myemail@gmail.com", "","", "94551a" ,"Mar","01");
		System.out.println(emp);
		emp.checkUserID(emp.userID);
		
		emp.checkFirstName(emp.firstName);
		
		emp.checkEmail(emp.email);
		
		emp.checkHomeAddress(emp.HomeAddress);
		
		emp.checkCity(emp.city);
		emp.checkZipCode(emp.zipCode);
		emp.checkMonth(emp.month);
		
		emp.checkDay(emp.day);
	
	}
}


