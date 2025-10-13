package assignment3;

public class Custom2 {

	public static void main(String[] args) {
		try {
		if(20 > 10) {
			throw new numberisgreaterException("20 > 10");
		}
		}
		catch(numberisgreaterException e) {
			System.out.println(e.getMessage());
		}

	}

}

class numberisgreaterException extends RuntimeException{
	
	public numberisgreaterException(String str) {
		super(str);
	}
}
