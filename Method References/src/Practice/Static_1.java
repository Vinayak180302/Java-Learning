package Practice;

import java.util.Arrays;
import java.util.List;


//writing static references instead of lambda 
// Predicate
public class Static_1 {

	public static void main(String[] args) {
		
		List<String> li = Arrays.asList("vinayak", "viraj", "raj", "om", "nama");
		
		li.stream().filter(Demo::checkletter)
		.forEach(System.out::println);
		
		
		System.out.println("***********");
		
		
		List<Integer> li1 = Arrays.asList(41, 24, 54, 32, 65, 78, 5, 80);
		li1.stream().filter(Demo::checkbig)
		.forEach(System.out::println);
		
		System.out.println("***********");
		
		li1.stream()
		.filter(Demo::iseven)
		.forEach(System.out::println);
		
		System.out.println("************");
		
		li1.stream()
		.filter(Demo::divisiblefive)
		.forEach(System.out::println);
		
		System.out.println("*************");
		
		li.stream()
		.filter(Demo::checklett)
		.forEach(System.out::println);

	}

}

class Demo{
	
	public static boolean checkletter(String s) {
		return s.startsWith("v");	
	}
	
	
	
	public static boolean checkbig(int i) {
		return i>40;
	}
	
	
	public static boolean iseven(int i) {
		return i%2==0;
	}
	
	
	public static boolean divisiblefive(int i) {
		return i%5==0;
	}
	
	
	public static boolean checklett(String s) {
		return s.endsWith("a");
		
	}
}
