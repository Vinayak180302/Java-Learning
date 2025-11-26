package filter;

import java.util.List;

public class Filter6 {

	 public static boolean isPrime(int n) {
     	if(n <= 1) {
     		return false;
     	}
     	
     	for(int i =2; i <= n/2; i++) {
     		if(n%i == 0) {
     			return false;
     		}
     	}
     	return true;
     }
	 
	 
	public static void main(String[] args) {

		//print prime no.
		List<Integer> li = List.of(2, 3, 4, 5, 6, 7, 9);
		li.stream().filter((i)->{return isPrime(i);}).forEach((i)->{System.out.println(i);});
		
		
		System.out.println("*************");
		
		//print words which are pallindrome
		List<String> li1 = List.of("level", "java", "madam", "hello");
		
		li1.stream().filter((i)->{return i.equals(new StringBuilder(i).reverse().toString());}).forEach((i)->{System.out.println(i);});
		
	}

}
