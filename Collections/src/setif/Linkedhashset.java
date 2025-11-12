package setif;


import java.util.LinkedHashSet;
import java.util.Set;

public class Linkedhashset {
/*
 * LinkedHashSet -
 * - insertion order is maintained
 * - still random access is not possible
 *   - but we can access 1st & last elem. by creating reff. of child instead of polymorphic obj.
 * - initial cap. is 16 & load factor is 0.75
 * - no duplicates allowed
 * 
 * 
 * - 
 * */
	public static void main(String[] args) {
		
			LinkedHashSet<Integer> set = new LinkedHashSet<>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(5);
		set.add(8);
		set.add(null);
		set.add(null);
		System.out.println(set);
		
		System.out.println(set.getFirst());    // access due to child class reff. instead of polymorphic obj.
		System.out.println(set.getLast());
		
		Set<String> link = new LinkedHashSet<String>();
		
		link.add("vinayak");
		link.add("akash");
		link.add("vinayak");
		link.add("shubham");
		
		System.out.println(link);
		
	}

}
