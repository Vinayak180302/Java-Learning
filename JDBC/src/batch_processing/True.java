package batch_processing;

/*
 * Batch processing using transaction - 
 *  - means grouping multiple queries and executing them at once
 *  
 *  -setAutoCommit(true) - 
 *    - if true, it treat every sql query as individual transaction 
 *    - if set true, means don't have to explicitly commit the changes using co.commit()
 *    - if query get succeed, it will immediately get commited 
 *    -if failed, not commited, no rollback happen in case of setAutoCommit(true)
 * 
 * */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class True {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Vinayak18@");
		
       
        PreparedStatement ptmt = con.prepareStatement("insert into stud values (?, ?);");
        
        Scanner sc = new Scanner(System.in);
        
        con.setAutoCommit(true);
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
        
//        con.commit();
        }
        catch(Exception e) {
//        	System.out.println("initiating rollback");
//        	con.rollback();
        	
        	System.out.println(e.getMessage());
        }
        
       
      
        
		

	}

}
