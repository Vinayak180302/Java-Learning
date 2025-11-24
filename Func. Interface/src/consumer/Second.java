package consumer;

import java.util.function.Consumer;

public class Second {

/*
 * default method - 
 *  -default Consumer<T> andThen(Consumer<T>)-
 *   - it combine 2 Consumers<T> and run it sequentially (first --> second)
 * */
	public static void main(String[] args) {
		Consumer<Integer> con = (i)->{System.out.println(i);};
		
		Consumer<Integer> cons1 = (j)->{System.out.println(j);};
		
	    Consumer<Integer> con3 = con.andThen(cons1);
	    con3.accept(10);
	    
	     
	    Consumer<String> con4 = (i)->{System.out.println("hello " + i + " nice to meet you");};
	    
	    Consumer<String> con5 = (j)->{System.out.println("Hope you are doing well "+ j + "!");};
	    
	    Consumer<String> con6 = con4.andThen(con5);
	    
	    con6.accept("Vinayak");
	    
	
	}

}
