package mapif;

import java.util.LinkedHashMap;
import java.util.Map;

/*
 * LinkedHashMap - 
 * - extends HashMap
 * - maintain insertion order
 * - initial cap.- 16, Load factor- 0.75
 * - 1 null key allowed
 * - multiple null values are allowed
 * 
 * - internally use hashMap(for hashing) & doubly linkedlist(for maintaining order)
 * - so it uses hashing, means it use .hashCode() & .equals() to check uniqueness of keys
 * */
public class Link {

	public static void main(String[] args) {
		Map<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(1, "abc");
		map.put(5, null);
		map.put(3, null);
		map.put(1, "xyz");      // if key is already there, it will replace/override the value 
		map.put(null, "kas");
		map.put(null, "lmn");
		System.out.println(map);
		
		
	}

}
