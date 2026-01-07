package executor;

public class Volatile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


class Task extends Thread{
	
	volatile boolean stop = false;
	
	public void run() {
		while(!stop) {
			System.out.println("in thread");
		}
		System.out.println();
		
	}
	
}