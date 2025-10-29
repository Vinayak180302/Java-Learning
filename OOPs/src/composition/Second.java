package composition;

public class Second {

	public static void main(String[] args) {
		
	Address a1 = new Address();
	Order o1 = new Order(a1);
	o1.price= 100;
	o1.items = new String[] {"tv", "machine"};
	o1.date = "18/03/2002";
	
	System.out.println(o1);
	
	
	

	}

}

class Order{
	int price;
	String[] items;
	String date;
	
	Address a1;
	
	Order(Address a1){
	this.a1 = a1;	
	}
	
	public String toString() {
		return this.date + " " + this.price;
	}
}

class Address{
	int pincode;
	String landmark;
	
	void show() {
		System.out.println("address method");
		System.out.println("address is ");
	}
	
	
}




