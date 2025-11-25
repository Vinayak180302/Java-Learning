package function;

import java.util.function.Function;

/*
 * static method - Function<T, T>.identity()
 * - it is static method
 * - it returns function that always returns its input arguments
 * */
public class Fourth {

	public static void main(String[] args) {
		
		Function<Integer, Integer> fun1 = Function.identity();
		System.out.println(fun1.apply(10));
		
	    Function<String, String> fun2 = Function.identity();
	    System.out.println(fun2.apply("hii hello"));
	}

}
