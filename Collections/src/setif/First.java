package setif;

import java.util.HashSet;
import java.util.Set;

public class First {

/*
 * Set - 
 * 
 * HashSet - 
 * - insertion order is not maintained
 * - no duplicates are allowed in hashSet
 * - only  1 null values are allowed
 * - initial cap. is 16 and load factor is 0.75
 * - hashSet is used to maintain uniqueness
 * - it add elements on the basis of hashCode (if hashcode is diff. then it will only add)
 * 
 * Internal Working - 
 * - 1st it will check hashcode and then equalness by .equals()
 * - if hashcode is same then it will check .equals()
 * - if hashcode is diff. then it will not check .equals() 
 * */
	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<Integer>();
		
		
		set.add(5);
		set.add(1);

		set.add(3);
		set.add(3);
		set.add(8);
		set.add(2);
		set.add(null);
		set.add(null);
		
		System.out.println(set);
	
	}

}
