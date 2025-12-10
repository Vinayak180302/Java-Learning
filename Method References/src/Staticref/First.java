package Staticref;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.Consumer;
import java.util.function.Function;

public class First {
	
	
    public static boolean checkBigger(int i) {
    	return i>10;
    }
    
    
    //predicate
    public static boolean check(int i) {
    	return i%2==0;
    }
    
    //consumer
    public static void cap(String i) {
    	System.out.println(i.toUpperCase());
    }
    
    
    //function
    public static int convert(String i) {
    	return i.length();
  }
    
    
    //supplier
    public static int give() {
    	return 1000 *2;
    }
    
    
    
	public static void main(String[] args) {
//		List<Integer> li = Arrays.asList(1, 5, 4, 71, 54, 64, 21);
//		
//		li.stream().filter(First::checkBigger).forEach(System.out::println);
		
		
		//Without method ref. only using lambda
		
		Predicate<Integer> iseven = (i)->(i%2==0);
		System.out.println(iseven.test(23));
		
		//using method ref. instead of lambda
		Predicate<Integer> even = (First::check);
		System.out.println(even.test(24));
		
		
		
	   Consumer<String> con = (i) -> {System.out.println(i.toUpperCase());};
	   con.accept("vinayak");
	   
	   Consumer<String> cons = (First::cap);
	   cons.accept("kumkar");
	   
	   
	   Function<String, Integer> fun = (i)->(i.length());
	   System.out.println(fun.apply("vinayak"));
	   
	   Function<String, Integer> fun1 = (First::convert);
	   System.out.println(fun1.apply("vinayak"));
	   
	   
	   Supplier<Integer> sup = ()->(1000);
	   System.out.println(sup.get());
	   
	   Supplier<Integer> sup1 = (First::give);
	   System.out.println(sup1.get());
	    
	   
	     
	}

}
