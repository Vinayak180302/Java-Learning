package Abstraction;

public class Anonymous1 {

	public static void main(String[] args) {
	Demo d = new Demo() {
		public void show(int a, int b) {
			System.out.println(a+b);
			
		}
	};
	
	I_Demo d1 = new I_Demo() {
		public void Demo1() {
			System.out.println("hello");
		}
	};
	
	d.show(10, 20);
	d1.Demo1();
		
				
	}

}

abstract class Demo{
	
	
	abstract public void show(int i, int j);
}


interface I_Demo{
	
	public void Demo1();
}
