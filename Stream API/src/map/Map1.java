package map;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/*
 * map() - 
 * - is used to convert data from one type to another     
 * - it accepts lambda of function (func. interface)
 * - 
 * */
public class Map1 {

	public static void main(String[] args) {
		
		//convert int to string
		List<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(7);
		list.add(2);
		list.add(6);
		list.add(3);
		list.add(9);
		
		list.stream().map((i)->{return i.toString();}).forEach((i)->{System.out.println(i);});
		
		
		System.out.println("**********************");
		
		//convert string to int
		List<String> list1 = new ArrayList<String>();
		list1.add("4");
		list1.add("6");
		list1.add("3");
		list1.add("6");
		list1.add("3");
		list1.add("9");
		
		list1.stream().map((i)->{return Integer.parseInt(i);}).forEach((i)->{System.out.println(i);});
		
		System.out.println("************************");
		//convert int to double
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(4);
		list2.add(7);
		list2.add(2);
		list2.add(6);
		list2.add(3);
		list2.add(9);
		
		list2.stream().map(new Convert()).forEach((i)->{System.out.println(i);});

	}

}

class Convert implements Function<Integer, Double>{

	@Override
	public Double apply(Integer t) {
		return Double.valueOf(t * 2);
	}
	
}