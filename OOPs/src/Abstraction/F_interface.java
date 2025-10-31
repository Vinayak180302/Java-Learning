package Abstraction;


/*
 * functional interface-
 * interface having only 1 abstract method called functional interface
 * contain static and default method as many as u want, compulsion was only on abstract method
 * 
 * 
 * */

public class F_interface {

	public static void main(String[] args) {
		
		I_1 i = (a)->{    //lambda exp.   (lambda always work with functional interface)
			System.out.println("hello");
		};
		
		i.show1(1);
		
		I_2 i2 = (a, b)->{
			System.out.println(a + b);
		};
		
	   i2.display(10, 20);
	}
}
	
	

interface I_2{
	public void display(int a, int b);
}



@FunctionalInterface
interface I_1{
	
	public void show1(int a);    //abstract method
	
	
	public static void demo3() {    //static method

     }
	
	default public void demo5() {     //default method
		
	}
}
