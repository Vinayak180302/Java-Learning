package Assignment1;



public class Eight {

	public static void main(String[] args) {
		Thread t = new Thread();
		
		try {
		t.setPriority(0);
		}
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("THE END");
		
		
	}

}
