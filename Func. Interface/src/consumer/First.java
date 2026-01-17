package consumer;

import java.util.function.Consumer;

public class First {

/*
 * Consumer<T> - 
 * - it is func. interface which helps only to consume things
 * - it basically accepts single input and returns nothing
 * 
 *  - Methods -
 *    -void accept(T t);
 * */
	public static void main(String[] args) {
		
		Consumer<String> cons = (i)->{System.out.println("Hii " + i + "!");};
		cons.accept("Vinayak");
		
		Consumer<Integer> cons1 = (j)->{System.out.println(j * 10);};
		cons1.accept(12);
		
		Consumer<Integer> cons2 = (k)->{System.out.println( k * 20);};
		cons2.accept(10);
		
		Consumer<Integer> con5 = cons1.andThen(cons2);
		
		con5.accept(50);
	}

}
