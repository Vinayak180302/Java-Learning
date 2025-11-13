package object;

import java.util.Objects;

public class Equal1
{
	
	
/*
 * Steps to override .equals()-
 * - check both reff. are same
 * - check passing obj. is null 
 * - check both obj. are of same class
 * - then typecast the obj. and compare all imp. fields
 **/

public static void main(String[] args) {
		
//Here we override the .equals method and write custom logic to check actual value
	
		car1 c1 = new car1();
		c1.id= 1;
		c1.name = "honda";
		c1.price = 1111.00;
		
		car1 c2 = new car1();
		c2.id= 1;
		c2.name = "honda";
		c2.price = 1111.00;
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));   //true
		
		
		
//but still it is not optimized for the obj. of diff classes
		
		car2 c3 = new car2();
		
		c3.id = 1;
		c3.name = "honda";
		c3.price = 1111.00;
		
		System.out.println(c1.equals(c3));   // doesn't work give exception
  }

}


class car1{
	int id;
	String name;
	double price;
	
	
//	public boolean equals(Object obj) {    //for same class
//		
//		car1 c2 = (car1) obj;
//		
//		return this.id == c2.id && this.price == c2.price && this.name.equals(c2.name);
//		
//	
//	}
	
	
	
//optimised equal() for obj. of diff. classes
		
	public boolean equals(Object obj) {
		if(this == obj) return true;   // check reff. is same
		if(obj == null) return false;  // check passed obj. is null
		
		if(this.getClass() != obj.getClass()) return false;   // check both obj. is of same class 
		
		car1 c1 = (car1)obj;    //typecast the obj.
		
		return this.id == c1.id && this.price == c1.price && this.name.equals(c1.name);  //compare all imp. fields	
	}

	
	//always override .hashCode() with .equals()
	public int hashCode() {
		return Objects.hash(id,name,price);
	}
}

class car2{
	int id;
	String name;
	double price;
	
} 