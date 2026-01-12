package batch_processing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * Batch Processing - 
 *  - when we group multiple sql queries & execute at once then its called Batch processing
 *  
 *  - addBatch() method present in Statement interface is used to add sql queries in batch
 * 
 * */
public class Static {

/*
 * For Static queries -
 *  - we used Statement interface 
 * 
 * */
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
	    Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Vinayak18@");

		
		Statement stmt = con.createStatement();
		
		String s1 = "insert into stud values(2, 'raj');";
		
		String s2 = "insert into stud values(3, 'viraj');";
		
		String s3 = "insert into stud values(4, 'nama');";
		
		stmt.addBatch(s2);
		stmt.addBatch(s3);
		stmt.addBatch(s1);
		
		int[] arr = stmt.executeBatch();
		
		for(int i : arr) {
			System.out.println(i);
		}
		
		con.close();
		stmt.close();
		
		
		
	}

}
