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
 * - internally checks .hashCode() & .equals() same as HashMap
 * 
 * 
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
		map.put(3, "lmn");        //if key is present in hashtable, then it will override it with new value
		
		map.putIfAbsent(3, "pqr");   //only if key is not present, if key is not present
		
		
		System.out.println(map.getOrDefault(5, "xyz"));  //returns a value of specified key is mapped or if not mapped give default values we pass, but not modified in original hashtable
		
		
		System.out.println(map);
		
		
	}

}
