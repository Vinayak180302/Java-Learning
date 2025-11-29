package map;

import java.util.ArrayList;
import java.util.List;

public class Map7 {

	public static void main(String[] args) {
		List<Product> li = new ArrayList<Product>();
		li.add(new Product("laptop",20000));
		li.add(new Product("TV", 420000));
		li.add(new Product("fridge", 25000));
		
		li.stream().map((i)->{return i.name + " : " + i.price;}).forEach((i)->{System.out.println(i);});
	}

}

class Product{
	String name;
	int price;
	
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String toString() {
		return this.name + " " + this.price;
		
	}
	
	
}
