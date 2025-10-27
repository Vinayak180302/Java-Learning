package object;

/* By default .equal checks the memory referr. of obj.
 * but only in case of String it checks the actual value
 * */

public class Equal {

	public static void main(String[] args) {
		
		Car1 c1 = new Car1();
		c1.id= 1;
		c1.name = "honda";
		c1.price = 1111.00;
		
		Car1 c2 = new Car1();
		c2.id= 1;
		c2.name = "honda";
		c2.price = 1111.00;
		
		System.out.println(c1.equals(c2));   //it checks memory refer. of obj 
		
		
		String s1 = new String("vinayak");
		
		String s2 = new String("vinayak");
		
		System.out.println(s1.equals(s2));   // in case of string, it checks actual value
		
		
		

	}

}


class Car1{
	int id;
	String name;
	double price;
	
	
 
}