package Assignment1;

public class Seventh {

	public static void main(String[] args) {
		Object o1 = "vinayak";
		
		try {
		Integer i = (Integer) o1;
		}
		catch(ClassCastException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("THE END");

	}

}
