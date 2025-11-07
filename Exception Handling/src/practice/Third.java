package practice;

public class Third {

	public static void main(String[] args) {
		String str = null;
		
		
		try {
		System.out.println(str.length());
		
		int k = 10 / 0;
		}  
		catch(ArithmeticException e) {   //even though we write arithmetic exce. first but null pointer exce. occurs first
			System.out.println(e.getMessage());
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
		

	}

}
