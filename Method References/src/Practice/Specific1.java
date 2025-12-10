package Practice;

import java.util.function.Predicate;
/*
 * Predicate - specific
 * */
public class Specific1 {

	
	public static void main(String[] args) {
		
		Spec sp = new Spec();
		
		Predicate<String> pre = sp::lenghtof;
		System.out.println(pre.test("jdsvhdc"));
		
		System.out.println("***********");
		
		Predicate<String> pre1 = sp::start;
		System.out.println(pre1.test("vinayak"));
		
		System.out.println("*************");
		
		Predicate<String> pre2 = sp::check;
		System.out.println(pre2.test("hgkdug"));
		
		
		
		
		
		
	}

}

class Spec{
	
	public boolean lenghtof(String s) {
		return s.length() > 2;
	}
	
	public boolean start(String s) {
		return s.startsWith("a");
		
	}
	
	public boolean check(String s) {
		return s.contains("a");
	}
}