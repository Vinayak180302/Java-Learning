package filter;

import java.util.Arrays;
import java.util.List;

public class Filter3 {

	public static void main(String[] args) {
		
		List<Integer> li = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		//print even no
		li.stream().filter((i)->{return i % 2 == 0;}).forEach((i)->{System.out.println(i);});
		
		System.out.println("*************");
		
		//print no > 10
		List<Integer> li1 = Arrays.asList(5, 12, 18, 3, 7);
		li1.stream().filter((i)->{return i > 10;}).forEach((i)->{System.out.println(i);});
		
		System.out.println("*************");
		
		//print name start with "s"
		List<String> li2 = List.of("Sam", "Amit", "Sita", "Ravi");
		li2.stream().filter((i)->{return i.startsWith("S");}).forEach((i)->{System.out.println(i);});
		
		System.out.println("*************");
		
		//print words which length is > 4 in uppercase
		List<String> li3 = List.of("java", "python", "ai", "react");
		li3.stream().filter((i)->{return i.length() >4;}).forEach((i)->{System.out.println(i.toUpperCase());});
		
		//print no. which are divisible by 5
		List<Integer> li4 = List.of(10, 13, 25, 40, 7);
		li4.stream().filter((i)->{return i % 5==0;}).forEach((i)->{System.out.println(i);});
		
		System.out.println("********************");
		
		//print positive no.
		List<Integer> li5 = List.of(-3, 10, 0, 5, -7);
		li5.stream().filter((i)->{return i > 0;}).forEach((i)->{System.out.println(i);});
		
		System.out.println("*************");
		//print names ends with "a"
		List<String> li6 =List.of("Reena", "Akash", "Megha", "John");
		li6.stream().filter((i)->{return i.endsWith("a");}).forEach((i)->{System.out.println(i);});
		
		System.out.println("**************");
		//print no. between 10 & 50
		
		List<Integer> li7 = List.of(5, 12, 45, 60, 22);
		li7.stream().filter((i)->{return i > 10 && i < 50;}).forEach((i)->{System.out.println(i);});
		

	}

}
