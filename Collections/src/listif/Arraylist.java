package listif;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {
/*
 * ArrayList - 
 * - internally use dynamic array
 * - it maintain insertion order
 * - useful for random access of element(due to undex based) has O(1) constant time complexity
 * - not useful for insertion and deletion of elem. beacause internal shifting of indices - O(1) linear time complexity
 * - initial cap. is 10
 * - allow duplicates and multiple null values
 * */
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5); 
		list.add(5);  //can contain duplicate
		list.add(null);   //can contain multiple null values
		list.add(null);
		System.out.println(list);
		list.set(1, 10);    //set value at given index and remove previous elem.

		System.out.println(list);
		list.remove(4);   //remove elem. at given index
		System.out.println(list);
		
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.contains(10));
		
		
	}

}


