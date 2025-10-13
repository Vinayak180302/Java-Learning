package assignment3;

public class Custom3 {

	public static void main(String[] args) {
		
		String s1 = null;
		
		try {
		if(s1 == null) {
			throw new strigisNullException();
		}
		}
		catch(strigisNullException e) {
			System.out.println(e.getMessage());
		}

	}

}


class strigisNullException extends RuntimeException{
	
	public strigisNullException() {
		super("string is null");
	}
}