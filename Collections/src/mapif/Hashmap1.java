package mapif;

import java.util.HashMap;
import java.util.Map;

/*
 * Methods in HashMap - 
 * 
 * */
public class Hashmap1 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "ABC");
		map.put(2, "DEF");
		map.put(3, "GHI");
		map.put(4, "JKL");
		map.put(5, "MNO");
		map.put(6, null);
		
		System.out.println(map);
		System.out.println(map.get(4));   // to get value at specific key
		
		System.out.println(map.containsKey(7));
		System.out.println(map.containsValue("ABC"));
		
	    map.putIfAbsent(7, "STU");  //add value if key is absent or null
		System.out.println(map);
		map.putIfAbsent(6, "VWX");     //update value because value is null
		map.putIfAbsent(5, "YZ");      //not update because value are there already
		System.out.println(map);
		
		
	}

}
