package Assignment1;

public class Second {

	public static void main(String[] args) {
	String s1 = null;
	
	try {
	System.out.println(s1.length());
	}
	catch(RuntimeException e) {
		System.out.println(e.getMessage());
	}
	System.out.println("THE END");
	}

}
