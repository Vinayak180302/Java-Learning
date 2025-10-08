package oops_2;

public class Static2 {

	public static void main(String[] args) {
	  
	   I_sport.info();
	   
	   Cricket.info();
	   
	   Cricket c = new Cricket();
	   c.info();
	}

}

interface I_sport {
	public static void info() {
		System.out.println("method of I_sport i/f");
	}
}

class Cricket implements I_sport{
	
	public static void info() {           //method hiding not overriding       
		System.out.println("info in Cricket");
	}
	
	
}
