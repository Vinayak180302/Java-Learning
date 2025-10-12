package demo;

public class Throw {

	public static void main(String[] args) {
		int age =20;
		
		try {
			if(age<18) {
				throw new Exception("invalid age");
			}
			System.out.println("you can vote");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("the end");
		}

	}

}
