package propagationofexception;

public class Voting2 {

	public static void main(String[] args) throws invalidageException, isIndianException{
		
		Vote.check(15, false);
		

	}

}

class Vote{
	public static void check(int age, boolean isIndian) throws invalidageException, isIndianException{
		 
		if(age < 18) {
			throw new invalidageException();
		}
		
		if(age < 18 && isIndian==false) {
			throw new isIndianException();
			
		}
	}
}
