package oops_2;

public class Demo {

	public static void main(String[] args) {
     Fox f1 = new Fox();
     f1.demo();
      
     Tiger t1 = new Tiger();
     t1.demo();
     t1.nemo();
       
	}

}


interface I_Animal{
	int id=20;      //by-default var. are static and final in interface
	
	void eat();     //and methods are public and abstract
	
	void run();
	
	public default void demo() {            //default method doesn't need to override in class
		System.out.println("default method of I_Animal");
	}
}

class Fox implements I_Animal {

	@Override
	public void eat() {
		System.out.println("fox eats");
		
	}

	@Override
	public void run() {
		System.out.println("run method");	
	}
	
}

interface I_Plant{
	void breadth();
	
	default void nemo() {
    System.out.println("deafault method of I_Plant");
    }
}

class Tiger implements I_Animal, I_Plant{

	@Override
	public void breadth() {
		System.out.println("braedth() in Tiger");
	}

	@Override
	public void eat() {
		System.out.println("eat() in Tiger");
	}

	@Override
	public void run() {
		System.out.println("run() in tiger");
	}
	
}

