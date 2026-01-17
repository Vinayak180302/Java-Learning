package logical;

import java.util.List;

public class Second {

	public static void main(String[] args) {
		
		//Print strings whose length is greater than 5, in uppercase
		List<String> list = List.of("java", "springboot", "api", "hibernate", "js");
		
		list.stream()
		.filter(Great::len)
		.map(String::toUpperCase)
		.forEach(System.out::println);

	}

}

class Great{
	
	public static boolean len(String s) {
		return s.length() > 5;
	}
}