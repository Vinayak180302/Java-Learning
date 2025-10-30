package composition;

public class Composition {

	public static void main(String[] args) {
		
		Heart h1 = new Heart();
		Human h2 = new Human(h1);

	}

}

class Human{
	int name;
	
	Heart h1;
	
	Human(Heart h1){
		this.h1 = h1;
	}
	
	
}

class Heart{
	
	
	
}
