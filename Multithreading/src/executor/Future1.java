package executor;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
 * there is another method - submit()
 *   - which expects Callable & returns Future<T>
 *   - Callable<V> is func. i/f - which has call()  abstract method
 *   - Future<T> is an interface
 * 
 * */
public class Future1 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService ex = Executors.newFixedThreadPool(2);
		
		for(int i=0; i < 10; i++) {
			Demo d = new Demo(i);
			
			Future<String> ft = ex.submit(d);
			
			ft.get();
		}
		
		ex.shutdown();
		
		

	}

}

class Demo implements Callable<String>{
	
	int id;
	
	public Demo(int id) {
		this.id = id;
	}

	@Override
	public String call() throws Exception {
		
		System.out.println(Thread.currentThread().getName() + " calling " + this.id);
		
		Thread.sleep(1000);
		return "executing" + id;
		
		
	}
	
}
