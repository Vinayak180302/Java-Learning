package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Execute {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Vinayak18@");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter query");
		String query = sc.nextLine();
		
		Statement ps = con.createStatement();
		
		boolean rs = ps.execute(query);
		
		if(rs) {
//			ResultSet r = ps.executeQuery(query);
			ResultSet r = ps.getResultSet();			
			while(r.next()) {
				System.out.println(r.getInt(1) + " " + r.getString(2));
			}
		}
		else {
//			int n = ps.executeUpdate(query);
			
			int n = ps.getUpdateCount();
			System.out.println("total no. of rows affected - " + n);
		}
		
		con.close();
		sc.close();
	}

}
