package object;

public class Equal1
{

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
	
	
//	public boolean equals(Object obj) {
//		
//		car1 c2 = (car1) obj;
//		
//		return this.id == c2.id && this.price == c2.price && this.name.equals(c2.name);
//		
//	
//	}
	
	
	
//optimised equal() for obj. of diff. classes
	
public boolean equals(Object obj) {   
	
//	if(obj.getClass() != this.getClass()) {
//		return false;
//	}
	
	//or
	
	if(!(obj instanceof car1))
	{
		return false;
	}
		car1 c2 = (car1) obj;
		
		return this.id == c2.id && this.price == c2.price && this.name.equals(c2.name);
		
	
	}
}

class car2{
	int id;
	String name;
	double price;
	
} 