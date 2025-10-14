package assignment3_a;

public class Custom2 {

	public static void main(String[] args) {
	
		int balance = 5000;
		
		int amount =  6000;
		
		try {
		if(amount > balance) {
			throw new lowBalanceException("balance is low");
		}
		}
		catch(lowBalanceException e) {
			System.out.println(e.getMessage());
		}

	}

}

class lowBalanceException extends Exception{
	
	public lowBalanceException(String str) {
		super(str);
	}
}

