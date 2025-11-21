package mapif;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/*
 * Entry<K,V> - 
 * - inner interface inside Map interface 
 * - Entry<K,V> basically is single records in Map
 * - used to iterate through HashMap, LinkedHashMap, TreeMap
 * - Not used with HashTable (use Enumeration for iteration in HashTable)
 * 
 * - Methods in Map  - 
 * 
 *  - entrySet() - returns A Set of Map.Entry objects, where each Entry contains both key and value.
 * 
 *  - KeySet() - returns set of keys (gives set because keys are unique so to store it it uses set)
 *  
 *  - Values() - returns collection of values (because values can be duplicate)
 *  
 * - Methods in Map.Entry<> - 
 *  
 *  - getKey() - returns key
 *  
 *  - getValue() - returns value
 * */
public class Entry1 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "abc");
		map.put(2, "def");
		map.put(3, "xyz");
		

		
		
		//to get whole key-value pair
		for(Entry<Integer, String> en : map.entrySet()) {
			System.out.println(en);
		}
		System.out.println("**************");
		//to get only keys
		for(Entry<Integer, String> e : map.entrySet()) {
			System.out.println(e.getKey());
		}
		System.out.println("**************");
		//to get only values
		for(Entry<Integer, String> e1 : map.entrySet()) {
			System.out.println(e1.getValue());
		}
		System.out.println("**************");
		
		System.out.println("using only keyset();");
		for(Integer e : map.keySet()) {
			System.out.println(e);
		}
		System.out.println("**************");
		
		System.out.println("using only values();");
		for(String s : map.values()) {
			System.out.println(s);
		}
	} 

}
