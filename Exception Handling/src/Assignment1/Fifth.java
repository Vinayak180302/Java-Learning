package Assignment1;


public class Fifth {

	public static void main(String[] args) {
		String s1 = "vinayak";
		
		try {
		int i = Integer.parseInt(s1);
		System.out.println(i);
		}
		catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("THE END");
		
	}

}
