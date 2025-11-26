package filter;

import java.util.ArrayList;
import java.util.List;

public class Filter7 {

	public static void main(String[] args) {
		//Print products with price between 500 and 2000
		List<Products> li = new ArrayList<Products>();
		li.add(new Products("Bat", 600));
		li.add(new Products("Ball", 400));
		li.add(new Products("Tennis", 700));
		li.add(new Products("Gloves", 500));
		
		li.stream().filter((i)->{return i.price >=500 && i.price <=2000;}).forEach((i)->{System.out.println(i);});
		
	}

}

class Products{
	String name;
	int price;
	
	public Products(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String toString() {
		return "name = "+ name + ", price = "+ price;
	}
}
