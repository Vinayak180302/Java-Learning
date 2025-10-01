package Encapsulation;
/*  Encapsulation means bundling data(variables) and methods in single unit typically in class
 * 
 * Controlled access to method using setter and getter
 * */

public class First {

	public static void main(String[] args) {
		
		Animal a1 = new Animal();
		Animal a2 = new Animal();
		Animal a3 = new Animal();
		
		a1.setAnimalId(100);
		int id = a1.getAnimalId();
		System.out.println(id);
		
		a1.setAnimalName("Tiger");
		String name  = a1.getAnimalName();
		System.out.println(name);
		
	}

}

class Animal{
	private int AnimalId;
	String AnimalName;

	//Setter
	public void setAnimalId(int id) {
		if(id >=100) {
		this.AnimalId = id;
		}
		else {
		System.out.println("invalid id");
	         }
        }
	
	public void setAnimalName(String name) {
		this.AnimalName = name;
	}
	
	
	//Gettter
	public int getAnimalId() {
		return this.AnimalId;
	}
	
	
	
	public String getAnimalName() {
		return this.AnimalName;
	}
	
	
}
  