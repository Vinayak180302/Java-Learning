package supplier;

import java.util.function.Supplier;

/*
 * Supplier<T> - 
 * - it is func. interface 
 * - it doesn't take any input & returns the result of given type T
 * - it has only 1 method which is abstract -> T get(); 
 * */
public class First {

	public static void main(String[] args) {
		
		Supplier<Integer> sup = ()->{
			return 12 + 15 ;
		};
		
		System.out.println(sup.get());
		
		Supplier<String> sup1 = ()->{
			return "Vinayak" +" "+ "Kumkar";
			
		};
		
		System.out.println(sup1.get());
	}

}
