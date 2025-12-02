package distinct;

import java.util.ArrayList;
import java.util.List;


/*
 * Distinct()- 
 * - is intermediatory operation
 * - is used to select only unique elements from stream
 * - it checks uniqueness internally on the basis of checking .hashcode() 1st and then .equals()
 * 
 */
public class Distinct1 {

	public static void main(String[] args) {
		
		
		List<Integer> li = new ArrayList<Integer>();
		li.add(4);
		li.add(8);
		li.add(4);
		li.add(7);
		li.add(8);
		
		System.out.println(li);
		
	   li.stream().distinct().forEach((i)->{System.out.println(i);});
	}

}