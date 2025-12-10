package Practice;

import java.util.function.Predicate;

public class Specific1 {

	
	public static void main(String[] args) {
		
		Spec sp = new Spec();
		
		Predicate<String> pre = sp::lenghtof;
		
		System.out.println(pre.test("jdsvhdc"));
		
		
		
	}

}

class Spec{
	
	public boolean lenghtof(String s) {
		return s.length() > 2;
	}
}