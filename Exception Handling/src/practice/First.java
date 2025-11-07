package practice;

public class First {

	public static void main(String[] args) {
	Demo.checkage(18);

	}

}


class Demo{
	
	
	public static void checkage(int age) {
		
		if(age < 20) {
			try {
		  throw new UnderAgeException();      //custom Exception
			}
			catch(UnderAgeException e) {
				System.out.println(e.getMessage());
			}
		  
		}
		
	}
	


}


class UnderAgeException extends Exception{
	
	UnderAgeException(){
		super("age is below 20");
	}
}
