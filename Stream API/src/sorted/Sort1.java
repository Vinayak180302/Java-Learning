package sorted;

import java.util.ArrayList;
import java.util.List;
/*
 * sort() - 
 * - it is intermediatory operation
 * - sort() is used to sort elements in stream
 * - it internally use Comparable<> & Comparator<> for sorting
 * 
 * - In Wrapper class, Comparable<> is already implemented there so no need to write separately
 * - but in custom class, we have to implements Comparable<> on same class or Comparator<> on new class
 * 
 * 
 * */
public class Sort1 {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		
		li.add(4);
		li.add(7);
		li.add(8);
		li.add(2);
		li.add(3);
		
		li.stream().sorted().forEach((i)->{System.out.println(i);}); 
	}

}


