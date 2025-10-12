package demo;

public class Throw1 {

	public static void main(String[] args) {
		Animal.getage(22);
		
		System.out.println("hey there");

		
	}

}

class Animal{
	
	public static void getage(int age) {
          try{
			if(age>20) {
				throw new RuntimeException("age more than 20");     //if exception is of type of RuntimeException doesn't need to handle at compile time
			 }
          }
           catch(Exception e) {
        	   System.out.println(e.getMessage());
           }
		
	}
}