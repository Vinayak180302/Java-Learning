package function;

import java.util.function.Function;

/*
 * default method - func1.compose(fun2)           fun2 -> then -> fun1 execute
 * - it works on 2 functions
 * - it executes func2 1st and then func1
 * - so return type of 2nd func. & input type of 1st func. needs to be same 
 * - it returns new functions
 * 
 * */
public class Second {

	public static void main(String[] args) {
		
		Function<Integer, Double> fun = (i)->{
			return Double.valueOf(i);
		};
		
		Function<String, Integer> fun2 = (j)->{
			return Integer.parseInt(j);
		};
		
		Function<String, Double> fun3 = fun.compose(fun2);
		
		System.out.println(fun3.apply("123"));
		
		
//another e.g.
		
		Function<Integer, Double> fun4 = (k)->{
			return Double.valueOf(k);
		};
		
		Function<String, Integer> fun5 = (l)->{
			return Integer.parseInt(l);
		};
		
		Function<String, Double> fun6 = fun4.compose(fun5);
		
		System.out.println(fun6.apply("34561"));
	}
	
	
	
	
	
	
	

}
