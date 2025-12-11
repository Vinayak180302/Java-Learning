package instance;

import java.util.function.Supplier;

/*
 * Instance Method reff. - 
 * 
 *  - we already have object created & just call that object method
 * */
public class First {

	public static void main(String[] args) {
		String str = "vinayak";
		
		Supplier<Integer> fun = str::length;
		
		System.out.println(fun.get());
	}

}
