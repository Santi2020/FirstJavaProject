package day10;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbcDemo2 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "hr", "hr");
		Statement stmt = con.createStatement();
		String qry = "select employee_id,first_name,last_name from employees";
		ResultSet rs = stmt.executeQuery(qry);
		
		int eid ;
		String f_name;
		String l_name;
		
		while(rs.next())
		{
			
			f_name = rs.getString("FIRST_NAME");
			l_name = rs.getString("LAST_NAME");
			eid = rs.getInt("employee_id");
			System.out.println("Here " +eid +"        "+f_name +"            " +l_name);
			
		}
		
		
		//stmt.executeQuery(qry);
		con.close();
		System.out.println("Program completed successfully");
	}

}
