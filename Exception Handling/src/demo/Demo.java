package demo;

public class Demo {
	
	/*Hierarchy-
	 * Object->
	 *   Throwable ->
	 *                Error      Exception
	 *                            -Checked Exception (Compile Time)
	 *                            -Unchecked Exception (Run Time)
	 * */
	
	
	
	
	//keyPoint-
	/* 1 finally compulsary with 1 try
	 * 1 try and multiple catch possible
	 * multiple try without catch or finally not possible
	 * want to multiple catch, follow the order
	 *
	 **/

	public static void main(String[] args) {
		
		
	 //we can create try block without catch but compoulsary to have finally block
		try {
	        }
	finally {
		
	        }
		
		try {
			
		}
		catch(Exception e) {}

 }
	
}
