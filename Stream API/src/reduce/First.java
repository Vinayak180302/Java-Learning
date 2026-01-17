package reduce;

import java.util.List;

public class First {

	public static void main(String[] args) {
		
		List<Integer> li = List.of(1, 2, 3, 4, 5);
		
		int result = li.stream().reduce(0, (a, b)-> a + b);
		
		System.out.println(result);
	
	}

}
