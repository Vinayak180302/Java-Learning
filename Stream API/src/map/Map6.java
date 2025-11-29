package map;

import java.util.ArrayList;
import java.util.List;

public class Map6 {

	public static void main(String[] args) {
		List<String> li = new ArrayList<String>();
		li.add("java");
		li.add("stream");
		li.add("practice");
		
//		print only 1st letter
		li.stream().map((i)->{return i.subSequence(0, 1);}).forEach((i)->{System.out.println(i);});
		
		System.out.println("*************");
		
		List<Integer>  li1 = new ArrayList<Integer>();
		li1.add(1);
		li1.add(2);
		li1.add(3);
		li1.add(4);
		
		li1.stream().map((i)->{
			if(i%2==0) {
			return "Even";
			}
		return "odd";
		}).forEach((i)->{System.out.println(i);});
		
	}

}
