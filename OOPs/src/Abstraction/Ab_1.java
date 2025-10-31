package Abstraction;

//we can achieve abstraction by 2 ways - 
/*1. Abstract class (partial abstraction)
 * 2. Interface (100% abstraction)
 * 
 * 
 * 1st way
 * 
*/

public class Ab_1 {

	public static void main(String[] args) {
		Pune p1 = new Pune("pune");
		
		p1.showpincode("412206");
		
		p1.show();
		
		
//		City c1 = new City();     //cannot create obj. of abstract class

	}

}

abstract class City{
	String name;
	
	public City(String name) {
		this.name = name;
		System.out.println("parent ctr");
	}

	public void show() {
		System.out.println(this.name);
	}
	
	abstract public void showpincode(String pin);    //abstract method - decide only behaviour, implemented in child class
	
	public static void demo() {
		
	}
	
//	default public void dmeo1() {     //default method are only allowed in interface
//		
//	}
}

class Pune extends City{

	

	@Override
	public void showpincode(String pin) {
		
		System.out.println("pin is :" + pin);
		
	}
	
	public Pune(String name) 
	{
		super(name);
		
	}
	
}
