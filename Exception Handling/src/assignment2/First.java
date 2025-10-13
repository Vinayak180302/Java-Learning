package assignment2;

public class First {

	public static void main(String[] args) {
		try {
			int age = -10;
			if(age < 0) {
				throw new IllegalArgumentException();
			}
		}
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

	}

}
