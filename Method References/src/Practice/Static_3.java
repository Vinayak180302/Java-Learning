package Practice;

import java.util.Arrays;
import java.util.List;


//Function
public class Static_3 {

	public static int tolength(String s) {
		return s.length();
	}
	
	public static String newword(String s) {
		return s + " bye";
	}
	
	public static double convert(Integer i) {
		return i + 10;
	}
	
	
	public static void main(String[] args) {
		
		List<String> li = Arrays.asList("abcs", "dgf", "hjicsf", "jadsdgd");
		
		li.stream()
		.map(Static_3::tolength)
		.forEach(System.out::println);
		
		System.out.println("**********");
		
		li.stream()
		.map(Static_3::newword)
		.forEach(System.out::println);
		
		System.out.println("***********");
		
		List<Integer> li1 = Arrays.asList(14, 74, 2, 65);
		li1.stream()
		.map(Static_3::convert)
		.forEach(System.out::println);
		

	}

}
