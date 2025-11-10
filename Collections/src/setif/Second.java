package setif;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


/*
 * in hashset, elements add on basis of hashcode, if hashcode is diff. then elem. is added in hashset4
 * 
 * in custom class -
 * by default, hashcode and equal will never be true
 * in custom class hashcode is generated on basis of memory reff. (even 2 obj. are diff. but have same value, it still give diff hashcode)
 * so we need to override both methods in cyustom classes.
 * 
 * there are 2 cases (if hashcode is same) - 
 * 
 * it will check .equals()-
 *   - if .equals() is true it will not add that element
 *   - if .equals() is false, it will add element at same hashbucket (hash collision happens)
 *   
 * if hashcode() is diff. it will not check the .equals() directly add element
 * 
 * 
 * 
 * 
 * */
public class Second {

	public static void main(String[] args) {
		Student s = new Student(1, "vinayak");
		Student s2 = new Student(1, "vinayak");
		Student s3 = new Student(1, "vinayak");
		
		Set<Student> set = new HashSet<Student>();
		
		set.add(s);
		set.add(s2);
		set.add(s3);
		
		System.out.println(s.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s.equals(s2));
		
		System.out.println(set);

	}

}

class Student{
	int id;
	String name;
	
	Student(int id, String name){
		this.id = id;
		this.name = name;
		
	}
	
	public String toString() {
		return "id = " + this.id;
	}
	
	public int hashCode() {
		return Objects.hash(this.id, this.name);
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Student))
			return false;
		
		Student s1 = (Student)obj;
		
		return this.id == s1.id && this.name.equals(s1.name);
	}
	
}
