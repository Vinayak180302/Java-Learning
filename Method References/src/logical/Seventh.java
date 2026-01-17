package logical;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Seventh {

	public static void main(String[] args) {
		
		//Group strings by length
		
		List<String> list = List.of("java", "api", "spring", "boot");

		Map<Integer, List<String>> grp = 
		list.stream()
		.collect(Collectors.groupingBy(String::length));
		
		System.out.println(grp);
	}

}
