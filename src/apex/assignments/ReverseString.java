package apex.assignments;

public class ReverseString {
	public void reverse(String str) {
		StringBuilder revString = new StringBuilder();
		
		for (int i =str.length()-1; i>=0 ;i--) {
			revString.append(str.charAt(i));
		}
		
		System.out.println("Original String = "+str);
		System.out.println("Reverse String = "+revString);
		System.out.println("========================================");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Simba";
		ReverseString rs = new ReverseString();
		rs.reverse(str);
		rs.reverse("America");
	}

}
