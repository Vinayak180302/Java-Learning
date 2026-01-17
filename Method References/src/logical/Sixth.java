package logical;

import java.util.Comparator;
import java.util.List;

public class Sixth {

	public static void main(String[] args) {

		//Print second highest number
		
		List<Integer> list = List.of(10, 40, 30, 20, 50);
		
		list.stream()
		.sorted(new High())
		.skip(1)
		.limit(1)
		.forEach(System.out::println);
		
		
		
		
	}

}

class High implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o2, o1);
	}
	
}
