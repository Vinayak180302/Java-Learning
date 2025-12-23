package multi;


/*
 * MultiThreading - 
 *  - is a feature in java that allows multiple threads (tasks) to execute concurrently within a single program
 *  - Thread is a smallest unit of execution
 * 
 * 2 ways to create thread in java - 
 *  1. extending Thread class
 *  2. implementing Runnable interface
 *  
 *  
 *  1.Extending Thread class - 
 *  
 * Step 1 - extend our class with Thread class
 *        - override run() method
 *        - create obj. of our class 
 *        
 *        - start() - will actually create new Thread & internally call run()
 *  
 *  - Thread.sleep()- pauses the execution of current thread for specific time
 *  
 * */
public class First {

	public static void main(String[] args) throws InterruptedException {
		
		Demo d = new Demo();
		
		
		d.start();    //actually create new Thread
		
		Thread.sleep(2000);   //pauses the execution of current thread for specific time 
		
		
		for(int i=0; i < 20; i++) {
			System.out.println("*");
		}
		
	
	}

}

class Demo extends Thread {
	
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("--");
		}
	}
}
