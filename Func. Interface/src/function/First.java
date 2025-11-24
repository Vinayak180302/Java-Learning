package function;

import java.util.function.Function;

public class First {
	
/*
 * function<T, R> -
 *  - it is func. interface
 *  - it takes T type of value
 *  - and returns R type of value
 *  - 
 *  - use to converts String to Integer or Integer to String
 *  
 *   - Methods - 
 *   - Abstract method - R apply(T t);
 *      - take T input and process it give R output
 *      
 *  
 *  
 *  
 **/
	public static void main(String[] args) {
		
		Function<Integer, String> fun = (i)->{
			return Integer.toString(i);
		};
		
		System.out.println(fun.apply(10));
		
		
		Function<String, Integer> fun1 = (j)->{
			return Integer.parseInt(j);
		};
		System.out.println(fun1.apply("1000"));
		
		Function<String, String> fun2 = (k)->{
			return k.toUpperCase();
		};
		System.out.println(fun2.apply("vinayak"));

	}

}
