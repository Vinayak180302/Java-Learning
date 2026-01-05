package executor;


/*
 * Thread Pool - 
 *  - is a concept of creating optimal no. of threads to manage the execution of multiple tasks
 *  - it provides a way to resource optimization, avoid StackOverflowError, prevents the crashing of JVM
 * 
 * */
public class Pool {

	
	/*Without creating Thread pool - creating 5 threads for 5 tasks 
	 * 
	 * */
	public static void main(String[] args) {
		
		for(int i=1; i<5; i++) {
			Thread_demo thread = new Thread_demo(i);
			thread.start();
		}
		

	}

}

class Thread_demo extends Thread{
	int id;
	
	public Thread_demo(int id) {
		this.id= id;
	}
	
	public void run() {
		System.out.println("executing " + id);
		
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
