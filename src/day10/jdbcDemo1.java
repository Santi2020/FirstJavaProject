package day10;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbcDemo1 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "hr", "hr");
		Statement stmt = con.createStatement();
		//String qry = "Insert into region_copy values (5, 'India')";
		//String qry = "update region_copy set region_name= 'Bharat' where region_id = 5";
		String qry = "delete region_copy where region_id = 5";
		stmt.executeQuery(qry);
		con.close();
		System.out.println("Program completed successfully");
	}

}
