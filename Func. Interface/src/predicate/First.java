
package predicate;

import java.util.function.Predicate;

/*
 * Predicate<T t> - 
 * - it is func. interface
 * - Predicate<T> is used to check the specific condition
 * 
 * Methods in Predicate<T> -
 * 1)  -test(T t);    // abstract method
 *   -return true if input arg. matches the predicate, otherwise false
 *  
 * 2)  -default Predicate<T> negate() - 
 *   -return reverse of the result of test() method
 *   -in short, return predicate that represent logical negation of given predicate
 *   
 * 3)  -default Predicate<T> and(Predicate<T>)- 
 *   - works on 2 predicate 
 *   - returns true, if both predicates are true
 *  
 * 4)  -default Predicate<T> or(Predicate<T>)-
 *   - works on 2 predicate
 *   - returns true, if even only one condition is true 
 *   - 
 * 
 * * */
public class First {

	public static void main(String[] args) {
		
		Predicate<Integer> pred = (i)->{return i > 10;};
		
		Predicate<Integer> pred2 = (j)->{return  j % 2 == 0;};
		
		System.out.println(pred.test(15));
		
		System.out.println(pred.negate().test(15));
		
		Predicate<Integer> pred3 = pred.and(pred2);
		System.out.println(pred3.test(12));
		
		Predicate<Integer> pred4 = pred.or(pred2);
		System.out.println(pred4.test(15));
	} 

}
