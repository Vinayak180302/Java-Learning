package Assignment1;

public class First {

	public static void main(String[] args) {
	int a=10;
	int b=0;
	
	
	try {
	int j = a/b;
	}
	catch(ArithmeticException e) {
		System.out.println(e.getMessage());
	}
		
	System.out.println("THE END");
	}

}
