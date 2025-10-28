package contract;

import java.util.Objects;

/* if 2 obj. are equal according to .equal() they must return same hashcode
 * 
 * but 
 * 
 * if 2 obj. returning same hashcode that does not mean they are true according to equal() 
 * i.e. hash collision might occurs
 * */


/* so it is necessary to override both .equals() and .hashCode()
 * */
public class First {

	public static void main(String[] args) {
	Aeroplane a1 = new Aeroplane();
	a1.speed = 100;
	a1.name = "boing";
	a1.seats = 20;
	
	Aeroplane a2 = new Aeroplane();
	a2.speed = 100;
	a2.name = "boing";
	a2.seats = 20;
	
	System.out.println(a1.equals(a2));
	
	System.out.println(a1.hashCode());
	System.out.println(a2.hashCode());
	
	

	}

}

class Aeroplane{
	int speed;
	String name;
	int seats;
	
	public int hashCode() {
		return Objects.hash(speed,name,seats);
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Aeroplane)) {
			return false;
		}
		
		Aeroplane a2 = (Aeroplane) obj;
		
		return this.speed == a2.speed && this.seats == a2.seats && this.name.equals(a2.name);
	}
	
	
}
