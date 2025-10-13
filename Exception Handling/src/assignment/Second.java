package assignment;

public class Second {

	public static void main(String[] args) {
		int numerator = 100;
		int divisor = 0;
		try {
			if(divisor ==0) {
				throw new ArithmeticException("cannot divide by zero");
			}
		 }
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
	}

}


