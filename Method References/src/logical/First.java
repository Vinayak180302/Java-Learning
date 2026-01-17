package logical;

import java.util.Arrays;
import java.util.List;

public class First {

	public static void main(String[] args) {

		// print city whose ASCII code is > 110 in reverse order
		
		List<String> li = Arrays.asList("latur", "pune", "solapur", "mumbai", "rampur", "bhor");
		
		li.stream()
		.filter(AsciiChecker::check)
		.map(StringBuffer::new)
		.map(StringBuffer::reverse)
		.map(StringBuffer::toString)
		.forEach(System.out::println);
	}

}
 
class AsciiChecker{
	
	public static boolean check(String s){
		return s.charAt(0) > 110;
		
	}
}