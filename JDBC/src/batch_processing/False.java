package batch_processing;

/*
 * - setAutoCommit(false) -
 *  - if false, it treat all queries as single transaction
 *  - in case of false, we need to explicitly commit the changes permanently inside the DB using con.commit() 
 *  - and need to rollback in case of any exception using con.rollback()
 *  
 *  
 * */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class False {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Vinayak18@");
		
       
        PreparedStatement ptmt = con.prepareStatement("insert into stud values (?, ?);");
        
        Scanner sc = new Scanner(System.in);
        
        con.setAutoCommit(false);
        try {
        int count = 1;
        
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
        
       ptmt.executeBatch();
        
        con.commit();
        }
        catch(Exception e) {
//        	System.out.println("initiating rollback");
        	con.rollback();
        	
        	System.out.println(e.getMessage());
        }
	}

}
