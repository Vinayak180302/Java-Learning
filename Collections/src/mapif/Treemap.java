 package mapif;

import java.util.Map;
import java.util.TreeMap;


/*
 * TreeMap - 
 *- class in java implements map interface
 *- it stores elements in natural ordering/sorting on the basis of keys
 *- null not allowed in keys (gives- NullPointerException)
 *- null allowed in values
 *- 
 *
 * */

public class Treemap {

	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<Integer, String>();
		map.put(1, "abc");
		map.put(5, "cde");
		map.put(3, null);       //null allowed in values only
//		map.put(null, "lmn");   //not allowed in keys- gives NullPointerException
		map.put(9, "xyz");
		map.put(5, "efg");    
		
		
		
		
		System.out.println(map);
	}

}
