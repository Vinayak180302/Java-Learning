package logical;

import java.util.List;

public class Fourth {

	public static void main(String[] args) {
		
		//Convert list of strings into StringBuilder, reverse them, print

		List<String> list = List.of("java", "stream", "lambda");
		
		list.stream()
		.map(StringBuilder::new)
		.map(StringBuilder::reverse)
		.forEach(System.out::println);

	}

}
