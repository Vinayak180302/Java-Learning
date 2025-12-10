package Practice;

import java.util.function.Function;

/*
 * Function - for specific instance
 * */
public class Specific_2 {

	public static void main(String[] args) {
	
		Speci sp = new Speci();
		
		Function<Integer, String> fun = sp::convert;
		System.out.println(fun.apply(12));
		
		Function<String, Integer> fun1 = sp::convert1;
		System.out.println(fun1.apply("456"));
		
		Function<String, String> fun2 = sp::toupper;
		System.out.println(fun2.apply("vinayak"));
 		
		
	}

}

class Speci{
	
	public String convert(Integer i) {
		return Integer.toString(i);
	}
	
	public Integer convert1(String s) {
		return Integer.parseInt(s);
	}
	
	public String toupper(String s) {
		return s.toUpperCase();
	}
	
}
