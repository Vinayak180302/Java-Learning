package executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Pool1 {
/*
 * Creating Thread pool - 2 threads for 10 tasks
 * 
 * */
	public static void main(String[] args) {
		
		 ExecutorService ex = Executors.newFixedThreadPool(2);
		 
		 for(int i=0; i <10; i++) {
			 
           Thread_demo1 th = new Thread_demo1(i);
           
           ex.execute(th);
		 }
		 
		 ex.shutdown();
		 
		 
	}

}

class Thread_demo1 extends Thread{
	int id;
	
	public Thread_demo1(int id) {
		this.id= id;
	}
	
	public void run() {
		System.out.println(Thread.currentThread().getName() + "executing " + id);
		
		for(int i=0; i<10; i++) {
			
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}
}