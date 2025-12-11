package arbitary;

import java.util.Arrays;
import java.util.List;


/*
 * Arbitary obj. reff - 
 *  - in arbitary reff. , we do not give a specific parameter
 *  - the obj. will be provided later at runtime as parameter
 *  
 * 
 * */



public class First {

	public static void main(String[] args) {
		List<String> li = Arrays.asList("vinayak", "akash", "raj");
		
		li.stream()
		.map(String::length)
		.forEach(System.out::println);
		
		System.out.println("**********");
		
		li.stream()
		.map(String::toUpperCase)
		.forEach(System.out::println);
		
		
	}

}
