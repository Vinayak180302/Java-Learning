package callable_statement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class IN_Parameter {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

	    Class.forName("com.mysql.cj.jdbc.Driver");
		
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Vinayak18@");
        
        CallableStatement call = con.prepareCall("{call getbyid(?)}");
        
        call.setInt(1, 3);
        
        ResultSet rs = call.executeQuery();
        
        while(rs.next()) {
        	System.out.println(rs.getInt(1));
        	System.out.println(rs.getString(2));
        }
        
	}

}
