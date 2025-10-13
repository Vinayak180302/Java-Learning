package assignment;

public class First {

	public static void main(String[] args) {
		try {
			int age = -10;
			if(age < 0) {
				throw new IllegalArgumentException("age cannot be in negative");
			}
		}
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

	}

}
