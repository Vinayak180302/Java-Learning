package Abstraction;


/* Anonymous class - class without name
 * No need to take separate concrete class to override abstract method
 * Need to use polymorphic obj. with anony. class
 * 
 * 3rd way
 * */
public class Anonymous {

	public static void main(String[] args) {
		City1 c1 = new City1() {

	     	@Override
			public void showpincode(String pin) {
			    System.out.println("pin is :" + pin);
		       }
		};
		
		c1.show();
		c1.showpincode("412206");
	}
	
}

abstract class City1{
		String name;
		
		

		public void show() {
			System.out.println(this.name);
		}
		
		abstract public void showpincode(String pin);    //abstract method - decide only behaviour, implemented in child class
		
	}


	
	

