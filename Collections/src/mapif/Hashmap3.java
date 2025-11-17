package mapif;

import java.util.HashMap;
import java.util.Map;

/*
 * Different methods in HashMap -> 
 * 
 * */
public class Hashmap3 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "abc");
		map.put(2, "def");
		map.put(3, "ghi");
		map.put(4, "jkl");
		
		System.out.println(map);
		
		System.out.println(map.get(4));
		
		System.out.println(map.containsKey(5));
		System.out.println(map.containsValue("abc"));
		
		System.out.println(map.remove(4));
		System.out.println(map);
		
		System.out.println(map.remove(3, "ghi"));
		System.out.println(map);
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		
		System.out.println(map.isEmpty());
		
		System.out.println(map.size());
		
		map.clear();
		System.out.println(map.size());
		System.out.println(map);
	}

}
