package assignment3_a;

public class Custom {

	public static void main(String[] args) {
		int age = 15;
		
		try {
		if(age < 18) {
			throw new invalidAgeException();
		}
		}
		catch(invalidAgeException e) {
			System.out.println(e.getMessage());
		}

	}

}

class invalidAgeException extends Exception{
	
	public invalidAgeException() {
		super("age is below 18");
	}
}


                                                                                                                                                                                                                                                                                      


