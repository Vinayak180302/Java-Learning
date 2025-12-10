package Practice;

import java.util.Arrays;
import java.util.List;

//Consumer
public class Static_2 {
	
	public static void concat(String s) {
		System.out.println(s + "111");
	}
	
	public static void addTen(int i) {
		System.out.println(i + 10);
	}
	
	public static void addhello(String s) {
		System.out.println(s + " hello");
	}

	public static void main(String[] args) {
		
		List<String> li = Arrays.asList("abc", "def", "ghi", "jkl");
		li.stream()
		.forEach(Static_2::concat);
		
		System.out.println("**********");
		
		List<Integer> li1 = Arrays.asList(4, 2, 1, 3);
		li1.stream()
		.forEach(Static_2::addTen);
		
		System.out.println("**********");
		
		li.stream()
		.forEach(Static_2::addhello);
		
		
		
		
		
		
		
		

	}

}
