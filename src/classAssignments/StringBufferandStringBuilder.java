/*
 * Define a String buffer and append all alphabets and display the final string. 
 * And, do the same exercize using StringBuilder.
Check capacity and size function output before and after adding alphabets

 */
package classAssignments;

public class StringBufferandStringBuilder {

	public static void main(String[] args) {
		StringBuffer strBuffer = new StringBuffer(1);
		System.out.println("Capacity = " + strBuffer.capacity());
		strBuffer.append("a");
		strBuffer.append("bcd");
		System.out.println("Capacity = " + strBuffer.capacity());
		strBuffer.append("efghij");
		strBuffer.append("klmnopqrstuvwxyz");
		System.out.println("Capacity = " + strBuffer.capacity());
		strBuffer.trimToSize();
		System.out.println("After trimming Capacity = " + strBuffer.capacity());
		
		System.out.println(strBuffer);
		System.out.println("=================================================");
		
		
		StringBuilder sbldr = new StringBuilder();
		sbldr.append("a");
		sbldr.append("bcd");
		sbldr.append("efghij");
		System.out.println("sbldr =" + sbldr);
		System.out.println("sbldr = " + sbldr.capacity() );
		sbldr.append("klmnopqrstuvwxyz");
		System.out.println("sbldr = " + sbldr.capacity() );
		sbldr.trimToSize();
		System.out.println("After trimming = " + sbldr.capacity() );
		System.out.println("sbldr =" + sbldr);
		/*
		String str1;
		str1= "Simba";
		String str2;
		str2 = str1;
		
		System.out.println("Str1 = " + str1);
		System.out.println("Str2 = " + str2);
		
		System.out.println("Changing the value of str1" );
		str1 = "This is different value";
	
		System.out.println("After change Str1 = " + str1);
		System.out.println("After change Str2 = " + str2);
		*/
	}

}

