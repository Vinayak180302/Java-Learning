package mapif;

import java.util.HashMap;
import java.util.Map;

/*
 * HashMap - 
 * - initial cap.- 16, Load-factor- 0.75
 * - insertion order not maintained
 * - contain key-value pair
 * - key must be unique, value can be duplicate
 * - 1 null key allowed, multiple null values are allowed
 * - 
 * */

public class Hashmap {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "abc");
		map.put(2, "def");
		map.put(3, null);
		map.put(4, null);
		map.put(5, "mno");
		map.put(1, "pqr");
		map.put(null, "stu");
		map.put(null, "vwx");     //override value
		
		System.out.println(map);
	}

}
