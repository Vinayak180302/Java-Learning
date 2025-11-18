package mapif;

import java.util.Enumeration;
import java.util.Hashtable;


/*
 * Enumeration- 
 * - it is legacy iterator to traverse in hashtable
 * - provide 2 methods for enumeration-
 *  -keys()- gives enumeration of keys 
 *  -Elements() - gives enumeration of values
 *  
 *  -hasMoreElements() - checks more values are available
 *  -nextElements() - return next values
 * */
public class Hashtable1 {

	public static void main(String[] args) {
		Hashtable<Integer, String> map = new Hashtable<Integer, String>();
		map.put(1, "abc");
		map.put(2, "def");
		map.put(3, "ghi");
		map.put(4, "jkl");
		map.put(5, "mno");
		
//		System.out.println(map);
		
		Enumeration<Integer> e1 = map.keys();
		
		System.out.println("keys-");
		while(e1.hasMoreElements()) {
			System.out.println(e1.nextElement());
		}
		
		Enumeration<String> e2 = map.elements();
		
		System.out.println("values-");
		while(e2.hasMoreElements()) {
			System.out.println(e2.nextElement());
		}
		
		
		
	}

}
