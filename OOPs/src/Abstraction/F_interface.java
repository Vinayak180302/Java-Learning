package Abstraction;


/*
 * functional interface-
 * interface having only 1 abstract method called functional interface
 * 
 * 
 * */

public class F_interface {

	public static void main(String[] args) {
		
		I_1 i = (a)->{    //lambda exp.   (lambda always work with functional interface)
			System.out.println("hello");
		};
		
		i.show1(1);
	
	}
	
	
}




@FunctionalInterface
interface I_1{
	
	public void show1(int a);

}
