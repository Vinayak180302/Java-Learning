package propagationofexception;

public class Voting2 {

	public static void main(String[] args) {
		try {
		Vote.check(15, false);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}

class Vote{
	public static void check(int age, boolean isIndian) throws Exception, Exception{
		 
		if(age < 18) {
			throw new invalidageException();
		}
		
		if(age < 18 && isIndian==false) {
			throw new isIndianException();
			
		}
	}
}
