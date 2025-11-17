package mapif;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


/*
 * in this case, we override .hashcode & .equals in such way it will give same hashcode for 2 same keys and .equals true
 *  - if hashcode is same -> 
 *   - it will got to .equals, now it give true so it will consider key as same &override the value
 *   - but if only hashcode is same & .equals give false, it will not consider both keys same but -> 
 *      - for hashmap, now it is compulsion to place new  key-value pair in same hash-bucket cause hash-collision
 * */
public class Hahmap2 {

	public static void main(String[] args) {
		Map<Car, Integer> map = new HashMap<Car, Integer>();
		map.put(new Car(1, "Honda", 4545.00), 1);
		map.put(new Car(1, "Honda", 4545.00), 2);
		
		System.out.println(map);
		
	}

}

class Car {
	int id;
	String name;
	double price;
	
	
	public Car(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public String toString() {
		return this.id + " " + this.name + " "+ this.price;
	}
	
	public int hashCode() {
		return Objects.hash(this.id, this.name, this.price);
	}
	
	
	public boolean equals(Object o) {
		Car c1 = (Car) o;
		
		return this.id == c1.id && this.price == c1.price && this.name.equals(c1.name);
	}
	
}
