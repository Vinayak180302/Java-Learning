package map;

import java.util.ArrayList;
import java.util.List;

public class Map4 {

	public static void main(String[] args) {
		
		List<String> li = new ArrayList<String>();
		
		li.add("vinayak");
		li.add("java");
		li.add("stream");
		
//		check length of each word
		li.stream().map((i)->{return i.length();}).forEach((i)->{System.out.println(i);});
		
		System.out.println("******************");
		
		List<Integer> li1 = new ArrayList<Integer>();
		li1.add(4);
		li1.add(5);
		li1.add(6);
		
//		Add prefix "No: " before each number
		li1.stream().map((i)->{return "No : " + i;}).forEach((i)->{System.out.println(i);});
		
	}

}
