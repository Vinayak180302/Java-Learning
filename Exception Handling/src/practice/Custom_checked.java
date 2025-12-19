package practice;

public class Custom_checked {
	
	public  static void checkage(int age) throws InvalidAgeException {
		if(age < 18) {
			throw new InvalidAgeException();
			
		}
		System.out.println("age is above 18");
	}

	public static void main(String[] args) {
		
		try {
		Custom_checked.checkage(20);
		}
		catch(InvalidAgeException e) {
			System.out.println(e.getMessage());
		}


	}

}

class InvalidAgeException extends Exception{
	public InvalidAgeException(String s) {
		super(s);
	}
	
	public InvalidAgeException() {
		super("below ");
	}
}
