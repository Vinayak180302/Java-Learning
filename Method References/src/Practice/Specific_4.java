package Practice;

import java.util.function.Supplier;

/*
 * Supplier - for specific instance
 * */
public class Specific_4 {
	
	public String name() {
		return "vinayak" + " Kumkar";
	}
	
	public Integer num() {
		return 100* 5;
		
	}
	
	public Double dob() {
		return 10.00 * 6;
	}

	public static void main(String[] args) {
		Specific_4 sp = new Specific_4();
		
		Supplier<String> sup = sp::name;
		System.out.println(sup.get());
		
		System.out.println("*********");
		
		Supplier<Integer> sup1 = sp::num;
		System.out.println(sup1.get());
		
		System.out.println("***********");
		
		Supplier<Double> sup2 = sp::dob;
		System.out.println(sup2.get());
		
		

	}

}
