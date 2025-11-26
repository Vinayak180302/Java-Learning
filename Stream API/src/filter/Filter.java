package filter;

import java.util.ArrayList;
import java.util.List;

/*
 * Stream API - it is java-8 feature used to process sequence of data like collections(ArrayList, list, set)
 *  - it just provide pipeline to work with data
 *  - it doesn't modify the original data 
 *  - 
 *  
 *  - There are 2 types of Stream operations -
 *   1) Intermediatary operations - e.g. filter(), map(), flatMap(), distinct(), limit(), skip(), sorted() 
 *   2) Terminal operations - e.g. forEach(), collect(), reduce(), count(), anyMatch(), allMatch(), noneMatch(), findFirst(), findEnd()
 *   
 *  - we can write chain of intermediatory operations together but stream will not start unless or until we specified terminal operation
 *  
 * */
public class Filter {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(7);
		li.add(6);
		
//		System.out.println(li);
		
//		li.stream().forEach((i)->{System.out.println(i);});
		
		
		// print elements > 5
		li.stream()
		.filter((i)->{return i > 5;})
		.forEach((i)->{System.out.println(i);});
		
	}

}
