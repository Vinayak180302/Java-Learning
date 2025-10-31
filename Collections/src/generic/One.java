package generic;

//Generic - 
/*
 * generic let you create type-safe and reusable code where data type type is specified when the code is used(i.e. at time of obj. creation)
 * 
 * */
public class One {

	public static void main(String[] args) {
		Demo d1 = new Demo();
		System.out.println(d1.add("vinayak"));
		
		Demo2 d2 = new Demo2();
		System.out.println(d2.add("kumkar"));
	}

}

//implement interface with specific type
interface Ianimal <T> {     
	
	T add(T item);
}

class Demo implements Ianimal<String> {
	 String name;
	
	public String add(String name) {
		this.name = name;
		return name;
	}
	
}


class Demo2 implements Ianimal<String>
{
	String name;

	@Override
	public String add(String name) {
		this.name = name;
		return name;
	}
	
}