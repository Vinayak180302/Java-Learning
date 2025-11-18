package mapif;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

/*
 * Hashtable -
 * - it is Legacy class from java 1.0
 * - initial cap.- 11, Load-Factor - 0.75
 * - in both key & values, null not allowed (gives NullPointerException)
 * - Insertion order is not maintained
 * - Hashtable work with Enumeration
 * 
 * */

public class HashTable {

	public static void main(String[] args) {
	
		Hashtable<Integer, String> map = new Hashtable<Integer, String>();
		
		map.put(1, "abc");
		map.put(2, "def");
		map.put(3, "ghi");
//		map.put(null, "jkl");        //gives NullPointerException
//		map.put(4, null);
//		map.put(null, null);
		
		
		System.out.println(map);
		
		
	}

}
