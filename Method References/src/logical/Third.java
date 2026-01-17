package logical;

import java.util.List;

public class Third {

	public static void main(String[] args) {
		
		// Print numbers greater than 20 and square them

		List<Integer> list = List.of(10, 25, 30, 15, 40);
		
		list.stream()
		.filter((i)->{return i >20; })
		.map((i)->{return i * i;})
		.forEach(System.out::println);
	}

}
