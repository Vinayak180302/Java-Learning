package Practice;

import java.util.function.Supplier;

//supplier
public class Static_4 {
	
	public static Integer give()
	{
		return 100*2;
	}
	
	public static String name() {
		return "vinayak" + "!";
	}
	
	public static Double givedouble() {
		return 10.00 * 10;
	}

	public static void main(String[] args) {
		
		Supplier<Integer> sup = Static_4::give;
		System.out.println(sup.get());
		
		System.out.println("**********");
		
		Supplier<String> sup1 = Static_4::name;
		System.out.println(sup1.get());
		
		System.out.println("**********");
		
		Supplier<Double> sup2 = Static_4::givedouble;
		System.out.println(sup2.get());
		
	}

}
 