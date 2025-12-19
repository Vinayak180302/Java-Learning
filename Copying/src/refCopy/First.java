package refCopy;

/*
 * Reference Copy -
 *  - means multiple reff. pointing to the same object
 *  - so even though we create 2 object but actually there is only 1 actual object us created & other reff. are just pointing to that same object
 *  - so even if we change any field in the object using any reff. then it will reflect in every reff. who is pointing to that object
 *  
 *  - hashCode produce is same because pointing to same object
 * 
 * */
public class First {

	public static void main(String[] args) {
		Student s1 = new Student(1, "vinayak");
		
		Student s2 = s1;
		
		System.out.println(s1);
		System.out.println(s2);
		
		s2.name = "Raj";   //change in s2 but it is pointing to same object as s1 do so s1.name also changed
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

	}

}


class Student{
	int id;
	String name;
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	public String toString() {
		return this.id + " " + this.name;
	}
	
}