package listif;

import java.util.LinkedList;
import java.util.List;

public class Linkedlist1 {

	public static void main(String[] args) {
List<Integer> list = new LinkedList();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.addFirst(0);
		list.addLast(5);
		
	List<Integer> list1 = new LinkedList();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.addFirst(0);
		list1.addLast(5);
		
		
		
		System.out.println(list);
		
//		list.clear();       //to remove all elements from list
		
//		System.out.println(list);
	
		System.out.println(list.contains(5));    //to check if elem. is present in list
		
		list.addAll(list1);         //to add another collection
		System.out.println(list);

	}

}
