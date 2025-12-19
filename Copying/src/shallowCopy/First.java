package shallowCopy;


/*
 * clone()
 * - is used to create & return copy of object
 * - if we want to use clone() method in our class then need to implement Cloneable interface (Marker interface)
 * - and override the .clone()
 * - & in that method, call the clone() from object class to make copy of object
 * 
 *  * */
public class First {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Employee e1 = new Employee(1, "vinayak");
		
		Employee e2 = (Employee)e1.clone();
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
		System.out.println(e1);
		System.out.println(e2);
		
		e1.name = "om";
		System.out.println(e1);
		System.out.println(e2);
		
		

	}

}

class Employee implements Cloneable{
	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		System.out.println("hii");
	}
	
	public String toString() {
		return this.id + " "+ this.name;
		
	}
	
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
}
