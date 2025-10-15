package propagationandstatuscode;

public class Demo {

	public static void main(String[] args) {
		
		try {
			Googlepay.doPayment("112233",6000 );
		}
		catch(InvalidPinException e) {
			System.out.println(e.getMessage());
			System.out.println("code is : " + e.getCode());
			System.out.println("caused by : " + e.getCause());
			
		}
		catch(InsufficientBalanceException ex) {
			System.out.println(ex.getMessage());
			System.out.println("code is : " + ex.getCode());
			System.out.println("caused by : "+ ex.getCause());
		
			
		}
		catch(LimitReachException ex1) {
			System.out.println(ex1.getMessage());
			System.out.println("code is : " + ex1.getCode());
			System.out.println("caused by :"+ ex1.getCause());
		}
	
	}

}


class Googlepay{
	
	
	public static void doPayment(String str, int amount) throws InvalidPinException, InsufficientBalanceException,LimitReachException{
		
		String pin = "112233";
		
		int balance = 10000;
		int limit = 5000;
		
		
		System.out.println("initiating payment....");
		
		if(!pin.equals(str)) {
			throw new InvalidPinException("Pin is Wrong",100, new Throwable("wrong pin"));
		}
		
		System.out.println("checking balance.....");
		
		if(amount > balance) {
			throw new InsufficientBalanceException("Balance is low", 200, new Throwable("insufficient balance in account"));
		}
		
		
		System.out.println("checking limit....");
		balance = balance - amount;
		if(balance < limit) {
			throw new LimitReachException("Daily limit is Reach", 400, new Throwable("limit is ended"));
		}
	}
	
}