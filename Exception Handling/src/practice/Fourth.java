package practice;


/*
 *we can throw exception from constructor also
 * */
public class Fourth {

	public static void main(String[] args) {
		
		try {
			Age a = new Age(-5);
			
		}
		catch(IllegalArgumentException e) {
			System.out.println("exception caught :" + e.getMessage());
		}

		
		
		
	}
}

class Age{
	int age;
	
	public Age(int age) {
		if(age < 0) {
			throw new IllegalArgumentException("age cannot be negative");
		}
		this.age = age;
		System.out.println("age is : "+ age);
		
	}
	
	
}
