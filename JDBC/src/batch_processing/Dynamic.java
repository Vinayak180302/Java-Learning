package batch_processing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/*
 * For Dynamic queries - 
 *  - we used PreparedStatement interface
 * */
public class Dynamic {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
			
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Vinayak18@");
		
		PreparedStatement ptmt = con.prepareStatement("insert into stud values (?, ?);");
		
		int count = 1;
		
		Scanner sc = new Scanner(System.in);
		while(count < 4) {
			System.out.println("enter id -");
			int id = sc.nextInt();
			
			System.out.println("enter name -");
			String name = sc.next();
			
			ptmt.setInt(1, id);
			ptmt.setString(2, name);
			
			ptmt.addBatch();
			
			count++;
		}
		
		int arr[] = ptmt.executeBatch();
		
		for(int i : arr) {
			System.out.println(i);
		}
		
		sc.close();
		con.close();
		ptmt.close();

	}

}
