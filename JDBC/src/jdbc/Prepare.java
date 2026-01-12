package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Prepare {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("id - ");
		int id = sc.nextInt();	
		
		System.out.println("name - ");
		String name = sc.next();
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Vinayak18@");
		
		PreparedStatement ptmt = con.prepareStatement("insert into stud values(?, ?)");
		
				
		ptmt.setInt(1, id);
		ptmt.setString(2, name);
		
        ptmt.executeUpdate();
        
		System.out.println(ptmt);

		
		con.close();
		ptmt.close();
		sc.close();
	}

}
