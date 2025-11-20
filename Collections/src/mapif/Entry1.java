package mapif;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

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
