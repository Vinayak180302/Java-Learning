package multi;

/*
 * join() - 
 *  - is used to make current thread wait until another thread completes its execution
 *  
 *  
 *  Race Condition - 
 *   - when multiple threads access shared resources/data concurrently & final result depends on the execution order of threads,
 *     leading to unpredictable behavior
 *  
 * */
public class Join {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t = new Thread(new Demo2());
		
		Thread t1 = new Thread(()->{
			for(int i=0; i<20; i++) {
				System.out.println("^^");
			}
		});
		
		
		
		t.start();
		t.join();
		t1.start();
		t1.join();
		
		System.out.println("--");
		
		
	}

}

class Demo2 implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<20; i++) {
			System.out.println("*");
		}
		
	}
	
}
