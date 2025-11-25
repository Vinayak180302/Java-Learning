package function;

import java.util.function.Function;

/*
 * default method - fun1.andThen(fun2)            fun1 -> then -> fun2  executes    (opposite of .compose() )
 * - it works on 2 functions
 * - it executes fun1 1st and then fun2
 * - so return type of 1st  func. & input type of 2nd func. needs to be same 
 * - it returns new functions
 **/
public class Third {

	public static void main(String[] args) {
		
		Function<Integer, Double> fun1 = (i)->{
			return Double.valueOf(i);
		};
		
		Function<Double, String> fun2 = (j)->{
			return Double.toString(j);
		};
		
		Function<Integer, String> fun3 = fun1.andThen(fun2);
		
		System.out.println(fun3.apply(10));
		System.out.println(fun3.apply(21).length());
		
	}

}
