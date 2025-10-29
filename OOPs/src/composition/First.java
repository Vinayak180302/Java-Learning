package composition;
/*
 * Has-A Relationship has 2 types -
 * 1)Composition (tight coupling) - 1 obj. cannot exist without other 
 * 2)Aggregation (loose coupling) - 1 obj. can exist independently of the other.
 * 
 * */

/*
 * 1) Composition - 
 * */
public class First {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		
		c1.startcar();

	}

}


class Car{
	String name;
	Engine e1 = new Engine();
	
	void startcar() {
		System.out.println("inside car method");
		e1.start();
	}
	
	
	
}

class Engine{
	
	void start() {
		System.out.println("engine method");
	}
	
}