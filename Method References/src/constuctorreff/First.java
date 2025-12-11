package constuctorreff;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/*
 * Constructor Refference -
 *  - special kind of method reff.-
 *  - constructor of class use parameter of abstract method (i.e parameter of abstract method & constructor must be same)
 *  - make sure abstract method returning obj. of same type i.e obj. type of that constructor
 * */
public class First {

	public static void main(String[] args) {
		
		Function<String, String> pre = String::new;
		
		System.out.println(pre.apply("vinayak").length());
		
		Consumer<String> con = String::new;
		con.accept("vinayak");
		
		Supplier<String> sup = String::new;
		System.out.println(sup.get().concat("kumkar"));
		
		

	}

}
