package callable_statement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

public class OUT_Parameter {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		 Class.forName("com.mysql.cj.jdbc.Driver");
			
	     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Vinayak18@");
	     
	     CallableStatement call = con.prepareCall("{call getcount(?)}");
	     
	     call.registerOutParameter(1, Types.INTEGER);
	     
	     ResultSet rs = call.executeQuery();
	     
	     while(rs.next()) {
	    	 System.out.println("count is - " + rs.getInt(1));
	     }
	     
	        
	}

}
