package logical;

import java.util.List;

public class Fifth {

	public static void main(String[] args) {
		
		//Count how many strings start with a vowel
		
		List<String> list = List.of("apple", "banana", "orange", "grapes", "umbrella");
		
		long count =list.stream()
		.filter(Vowel::check)
		.count();
		
		System.out.println(count);
		

	}

}

class Vowel{
	
	public static boolean check(String s) {
		return s.startsWith("a") || s.startsWith("e") || s.startsWith("i") || s.startsWith("o") || s.startsWith("u");
			
		}
	
}
