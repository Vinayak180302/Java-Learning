package assignment3;

//Dynamic i.e. at time of obj. creation
public class Custom1 {

	public static void main(String[] args) {
	   int age = 20;
	   
	   try {
	   if(age>18) {
		   
		   throw new aboveageException("age is above 20");
	         }
	   }
	   catch(aboveageException e) {
		   System.out.println(e.getMessage());
	   }
	}

}

class aboveageException extends RuntimeException{
	public aboveageException(String str) {
		super(str);
	}
}
