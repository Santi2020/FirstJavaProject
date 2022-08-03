/*
 * 13	Read Date in ‘YYYYMMDD’ format and display in mm/dd/yy format 
 * and “dd day month yyyy” formats. 
 * Handle all the exceptions.
 */
package classAssignments;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateDemo {

	public static void main(String[] args) throws ParseException {
		Date dt = new Date();
		//dt="2020-02-10";
		System.out.println("Current date : " + dt);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat simDate = new SimpleDateFormat("MMM dd yyyy");
		String str;
		
		Date d3 = new Date(2010, 1, 3);
		System.out.println("date D3 : " +d3);
		
		System.out.println("Enter date (YYYYMMDD): ");
		//str= sc.next();
		str= "Jul 31 2020";
		System.out.println("You Entered date : " + str);
		//str=dt;
		dt= simDate.parse(str);
		System.out.println("Parsed date : " + dt);	
		
		System.out.println("===================================");
		/*
		String time = "Jul 31 2020";
		SimpleDateFormat sdf = new SimpleDateFormat("mm dd yyyy");
		Date date1 = sdf.parse(time);
		System.out.println(date1);
		*/
	}
}



