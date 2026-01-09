package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/*
 * Statement - is parent i/f of PreparedStatement
 *  - is used for static queries
 *  
 *  
 * executeUpdate()- 
 *  - use to write DDL & DML queries (create, insert, update, delete)
 *  - queries which returns int
 *  
 * executeQuery() - 
 *  - use to write DQL queries (select)
 *  - it returns ResulSet
 * 
 * */
public class First {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
//Step 1 - Registering the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
//Step 2 - Opening a connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Vinayak18@");
		
//Step 3 - writing sql queries
		Statement stmt = conn.createStatement();
		
//		int n = stmt.executeUpdate("insert into student values(1, 'vinayak');");      //executeUpdate() use for DDL & DML queries
		
		ResultSet r = stmt.executeQuery("select * from student;");                    //executeQuery() use for DQL queries
		
		
		
		
		while(r.next()) {
			System.out.println(r.getInt(1));
			System.out.println(r.getString(2)); 
		}
		
	
		
		
		
		
//		System.out.println("rows affected " + n);
		
		
		

	}

}
