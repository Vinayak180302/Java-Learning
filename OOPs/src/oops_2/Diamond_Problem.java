package oops_2;

public class Diamond_Problem {
	
	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.demo();
		
	}
	

}

interface I_animal {
	default void demo() {
		System.out.println("I_animal");
	}
}



interface I_plant{
	default void demo() {
		System.out.println("I_plant");
	}
}



class Dog implements I_animal, I_plant{

	@Override
	public void demo() {
		// TODO Auto-generated method stub
		I_animal.super.demo();
		I_plant.super.demo();
	}
	
}