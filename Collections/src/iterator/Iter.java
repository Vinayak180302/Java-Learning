package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


/*
 * Iterator - 
 *- it is interface present in java.util package
 *- it iterates over collection
 *-
 *- hasNext() - returns true if more elements are there to iterate
 *- next() - return elements of the collection   throw (NoSuchElementException) if elements are not there
 * */
public class Iter {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i < 10; i++) {
			list.add(i);
		}
		
		
		System.out.println(list);

		ListIterator<Integer> itr = list.listIterator();
		
		while(itr.hasNext()) { 
			
			System.out.println(itr.next());
			
		}
	}

}
