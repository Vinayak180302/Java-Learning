package multi;

/*
 * Synchronized keyword -
 * 
 *  - Synchronized keyword is used to prevent shared resources(critical section of code) to use/accessed/mutate by multiple threads at a same time
 *  
 *  - means, only 1 thread is having accessed on shared resources, other threads waits until the execution is complete by current thread 
 *  
 *  - but, only synchronized block gets locked, all other tasks are executed by all threads parallaly/concurrently
 *  
 *  - in short, synchronized keyword is used to allow only 1 thread at a time to access shares resources(critical section of code) 
 * 
 * */
public class Synchronized {

	public static void main(String[] args) throws InterruptedException {
		
		Increase inc = new Increase();
		
		One o1 = new One(inc);
		Two o2 = new Two(inc);
		
		o1.start();
		o2.start();
		
		Thread.sleep(1000);
		inc.display();
		

	}

}

class Increase {
	int count=0;
	
	public  void count() {
		count++;
	}
	
	public void display() {
		System.out.println("final counter" + count);
	}
	
}

class One extends Thread{
	Increase inc;
	
	public One(Increase inc) {
		this.inc = inc;
	}
	
  public void run() {
		for(int i=0; i <20000; i++) {
			inc.count();
			System.out.println("run form 1");
		}
	}
	
	
}

class Two extends Thread{
	Increase inc;
	
	public Two(Increase inc) {
		this.inc = inc;
	}
	
	
	  public void run() {
			for(int i=0; i <20000; i++) {
				inc.count();
				System.out.println("run from 2");
			}
	  }
	
}
