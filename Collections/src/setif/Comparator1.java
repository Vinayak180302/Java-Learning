package setif;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
/*
 * Comparator<T>-(Custom sorting)
 * - it is func. interface 
 * - it has method - compare(T o1, T o2); for sorting & adding element
 * - called custom sorting because sorting logic provide in diff. class
 * - if method return 0, means 2 obj. are same so it will not add in TreeSet
 * - we can provide diff. logics by creating diff. classe and pass the reff. of those classes in TreeSet Constructor 
 * 
 * 
 *  
 **/
public class Comparator1 {

	public static void main(String[] args) {
		Set<Car> tree = new TreeSet<Car>(new Name1Comparator());
		
		tree.add(new Car(105, "hundai"));
		tree.add(new Car(101, "Honda"));
		tree.add(new Car(103, "suzuki"));
		
		System.out.println(tree);
	}

}

class Car{
	int speed;
	String name;
	
	
	public Car(int speed, String name) {
		super();
		this.speed = speed;
		this.name = name;
	}
	
	public String toString() {
		return this.name;
	}
	
	
	
	
}

class SpeedComparator implements Comparator<Car> {

	@Override
	public int compare(Car o1, Car o2) {
		
		return o2.speed - o1.speed;
	}
	
}

class Name1Comparator implements Comparator<Car>{

	@Override
	public int compare(Car o1, Car o2) {
		
		return o1.name.compareTo(o2.name);
	}
	
	
}


