package callable_statement;

/*
 * CallableStatement - 
 *  - is interface which use to call stored procedure from DB
 *  - it is fastest compare to Statement & PrepaareStatement
 *  - fastest because it call store procedure & store procedures are already created in DB
 *  
 *  
 * Stored Procedures - 
 *  - A stored procedure is a set of SQL statements that is written once, stored inside the database, and executed whenever needed.
 *  - we can create procedure in 3 ways - 
 *     -IN parameter       e.g (IN id int)
 *     -OUT parameter      e.g (OUT count int)
 *     -INOUT parameter    e.g (INOUT sal double)
 * 
 * */

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class First {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {


		Class.forName("com.mysql.cj.jdbc.Driver");
		
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Vinayak18@");
        
        CallableStatement call = con.prepareCall("{call getstud()}");
        
        ResultSet rs = call.executeQuery();
        
        while(rs.next()) {
        	System.out.println(rs.getInt(1));
        	System.out.println(rs.getString(2));
        }
        
        con.close();
        call.close();
        rs.close();
		
	}

}
