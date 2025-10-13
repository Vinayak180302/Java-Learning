package assignment3;

public class Custom4 {

	public static void main(String[] args) {
		int amount = 1000;
		
		try {
		if(amount < 2000) {
			throw new insuffAmountException();
			
		}
		}
		catch(insuffAmountException e) {
			System.out.println(e.getMessage());
		}

	}

}

class insuffAmountException extends RuntimeException{
	
	public insuffAmountException() {
		super("insufficient amount");
	}
}
