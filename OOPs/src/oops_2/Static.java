package oops_2;

public class Static {
	
	//static method can't be override 

	public static void main(String[] args) {
		
		Hero h = new Hero();
		h.showclass();
		
		Actor.showclass();
		Hero.showclass();
	}

}

class Actor{
	public static void showclass() {
		System.out.println("hiie");
	}
}

class Hero extends Actor{
	public static void showclass() {
		System.out.println("hello");
	}
}
