package Abstraction;

public class Anonymous1 {
	//we can implement multiple method in one anonymous class

	public static void main(String[] args) {
	Demo d = new Demo() {
		public void show(int a, int b) {
			System.out.println(a+b);
			
		}
		
		public void Demo1() {
			System.out.println("hello");
		}
	};
	
	I_Demo d1 = new I_Demo() {
		public void Demo2() {
			System.out.println("hii hello");
		}
		
		public void Demo3(int i, int j) {
			System.out.println(i+j);
		}
	};
	
	
	d.show(10, 20);
	d.Demo1();
	
	d1.Demo2();
	d1.Demo3(10, 20);		
				
	}

}

abstract class Demo{
	
	
	abstract public void show(int i, int j);
	
	abstract public void Demo1();
}


interface I_Demo{
	
	public void Demo2();
	
	public void Demo3(int i, int j);
}
