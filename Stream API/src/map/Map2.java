package map;

import java.util.ArrayList;
import java.util.List;

public class Map2 {

	public static void main(String[] args) {
		List<String> li = new ArrayList<String>();
		li.add("java");
		li.add( "hello");
		li.add("world");
		
		//convert to uppercase
		li.stream().map((i)->{return i.toUpperCase();}).forEach((i)->{System.out.println(i);});
		
		System.out.println("*****************");
		
		List<String> li1 = new ArrayList<String>();
		li1.add("hii");
		li1.add("hello");
		li1.add("bye");
		
//		Add "!" at the end of each word
		li1.stream().map((i)->{return i + "!";}).forEach((i)->{System.out.println(i);});
		
		

	}

}
