package assignment3_a;

public class Custom5 {

	public static void main(String[] args) {
	
		String s = null;
		
		try {
		if(s == null) {
			throw new stringIsNull();
			
		}
		}
		catch(stringIsNull e) {
			System.out.println(e.getMessage());
		}
		
	}

}

class stringIsNull extends Exception{
	
	public stringIsNull() {
		super("string containing null");
	}
}