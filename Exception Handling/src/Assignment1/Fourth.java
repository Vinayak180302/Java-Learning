package Assignment1;

public class Fourth {

	public static void main(String[] args) {
		String s1 = "vinayak";
		
		try {
		System.out.println(s1.charAt(7));
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("THE END");
	}
		

}
