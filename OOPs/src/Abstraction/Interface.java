package Abstraction;

/** 2. Interface (100% abstraction before java 8) 
 * in interface, access modifier by default value is *public
 * There is no constructor in interface means - no obj.is create of interface
 *  
 *    
 *    2nd way
 **/
public class Interface {

	public static void main(String[] args) {
		
		I_UPI p1 = new Phonepe();
		
		System.out.println(p1.sendmoney_to_account("345343", 100000));
		System.out.println(p1.recievemoney(null, 0));

		
		I_UPI g1 = new Googlepay();
		
		System.out.println(g1.sendmoney_to_account(null, 200000));
		System.out.println(g1.recievemoney(null, 0));
	}
	
}

interface I_UPI{
	
	  //by default, method in interface are public
	public String sendmoney_to_account(String account_number, double amount);
	public String recievemoney(String number, double amount);
	
}



class Phonepe implements I_UPI{


	@Override
	public String sendmoney_to_account(String account_number, double amount) {
		
		return "money send to :" + account_number + "amount : " +amount;
	}

	@Override
	public String recievemoney(String number, double amount) {
		// TODO Auto-generated method stub
		return null;
	}
	
}



class Googlepay implements I_UPI{

	

	@Override
	public String sendmoney_to_account(String account_number, double amount) {
		// TODO Auto-generated method stub
		return "Google pe : " + amount;
	}

	@Override
	public String recievemoney(String number, double amount) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

