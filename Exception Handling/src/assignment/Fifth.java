package assignment;

public class Fifth {

	public static void main(String[] args) {
	Object obj = "abc";
	
	try {
		if(!(obj instanceof Integer)) {
			throw new ClassCastException("cannot cast string to int");
		}
	}
	catch(ClassCastException e) {
		System.out.println(e.getMessage());
	}

	}

}
