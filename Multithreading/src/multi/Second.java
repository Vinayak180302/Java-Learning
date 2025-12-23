package multi;

/*
 * Implementing Runnable interface - 
 * 
 * Runnable is func. interface
 * 
 * steps to create thread by implementing Runnable interface
 *   - create class 7 implement Runnable interface on it 
 *   - implement / override run() method in it 
 *   - create obj. of Thread class and pass instance of our class in it
 *   - then, start() will create new thread
 *   
 *   
 *   There are multiple ways to to create thread -
 *     1. by passing instance in Thread constructor
 *     2. using lambda
 *     3. create lambda of runnable & pass in Thread constructor
 *     4. using anonymous inner class
 *     
 * 
 * 
 *  
 * */
public class Second {

	public static void main(String[] args) {
		//1st way - 
		Thread t = new Thread(new Demo1());
		
		//2nd way - 
		Thread t1 = new Thread(()->{
			for(int i=0; i<30; i++) {
				System.out.println("^^");
			}

		});
		
		
		//3rd way - 
		Runnable r = ()->{
			for(int i=0; i<20; i++) {
				System.out.println("--*--");
			}

		};
		
		Thread t3 = new Thread(r);
		
		
		//4th way -
		Thread t4 = new Thread() {
			public void run() {
				for(int i=0; i<20; i++) {
					System.out.println("^^**");
				}

			}
		};
		
		
	
		
		t.start();
		t1.start();
		t3.start();
		t4.start();
//		
//		for(int i=0; i<20; i++) {
//			System.out.println("--");
//		}

	}

}

class Demo1 implements Runnable{
	
	public void run() {
		for(int i=0; i < 20; i++) {
			System.out.println("*");
		}
	}
}

