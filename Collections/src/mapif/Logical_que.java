package mapif;


import java.util.LinkedHashMap;
import java.util.Map;

 /*
  * Question - Counting the occurrence of characters
  * 
  * */

public class Logical_que {

	public static void main(String[] args) {
		String s = "vinayaka";
		
	char[] chars = s.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		//map - v - 1,  i - 1 n-1  a -1  y - 1 
		//v i n a y a
		for(int i=0; i<chars.length; i++) {
			int counter = 1;
			
			if(map.containsKey(chars[i])){
			  counter = map.get(chars[i]) + 1;
			  map.put(chars[i], counter);
			}
			else {
				map.put(chars[i], counter);
			}
			
			
		}
		System.out.println(map);
		
		
	}

}
