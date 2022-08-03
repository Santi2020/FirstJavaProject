package day4;

public class StringsDemo {

	public static void main(String[] args) {
		String s1, s2;
		s1="Welcome  ";
		s2 = " To Java ";
		
		System.out.println("s1 = " + s1);
		System.out.println("s2 = "+ s2);
		System.out.println("Length of String =" +s1.length());
		System.out.println("Concatenate 2 strings =" + s1.concat(s2));
		System.out.println("After trimming =" +s1.trim().concat(s2).length());
	
		System.out.println("");
		System.out.println("CharAt =" +s1.charAt(5));
		System.out.println("Contains =" +s1.contains("come"));
		System.out.println("Equals =" + s1.trim().equals("welcome"));
		
		System.out.println("EqualsIgnoreCase =" + s1.trim().equalsIgnoreCase("welcome"));
		
		System.out.println("Replace =" + s1.replace('e', 'a'));
		System.out.println("Replace strings =" + s1.concat(s2).replace("Java", "Selenium"));
		System.out.println("Substring =" + s1.substring(5,7));
		System.out.println("toLowercare = " +s1.toLowerCase());
		System.out.println("toUppercase = " + s1.toUpperCase() );
	}

}


