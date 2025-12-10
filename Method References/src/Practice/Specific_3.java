package Practice;

import java.util.function.Consumer;


/*
 *Consumer - reff. of instance of specific obj.  
 * */
public class Specific_3 {
	
	public void len(String s) {
		System.out.println(s.length());
	}
	
	public void cap(String s) {
		System.out.println(s.toUpperCase());
	}
	
	public void small(String s) {
		System.out.println(s.toLowerCase());
	}

	public static void main(String[] args) {
		
			Specific_3 sp = new Specific_3();
			
			Consumer<String> con = sp::len;
			con.accept("vinayak");
			
			System.out.println("*********");
			
			Consumer<String> con1 = sp::cap;
			con1.accept("vinayak");
			
			System.out.println("*********");
			
			Consumer<String> con2 = sp::small;
			con2.accept("KUMKAR");
			
			
			
			
			
			

	}

}

