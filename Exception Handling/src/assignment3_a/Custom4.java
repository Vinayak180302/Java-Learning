package assignment3_a;

public class Custom4 {

	public static void main(String[] args) {
		String s= "vinayak";
		
		try {
		if(!s.contains("z")) {
			throw new charNotContainException(); 
		}
		}
		catch(charNotContainException e) {
			System.out.println(e.getMessage());
		}

	}

}

class charNotContainException extends Exception{
	
	public charNotContainException() {
		super("given character is not available in string");
	}
}
