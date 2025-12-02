package distinct;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/*
 * in custom class .hashcode() & .equals() are by-default false 
 * so we need to override both method in such way it show hashcode & equality on the basis on values
 */
public class Custom1 {

	public static void main(String[] args) {
		List<Student> li = new ArrayList<Student>();
		li.add(new Student(1, "vinayak"));
		li.add(new Student(2, "om"));
		li.add(new Student(3, "akash"));
		li.add(new Student(4, "shubham"));
		li.add(new Student(2, "om"));
		
		System.out.println(li);
		
		li.stream()
		.distinct()
		.forEach((i)->{System.out.println(i);});
		
	}

}

class Student{
	
	int id;
	String name;
	
	public Student(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	
	
	public String toString() {
		return this.id + " " + this.name;
		
	}
	
	
	public int hashCode() {
		return Objects.hash(this.id, this.name);
	}
	
	public boolean equals(Object o) {
		if(this==o) return true;
		
		if(o == null) return false;
		
		if(this.getClass() != o.getClass()) return false;
		
		Student s = (Student) o;
		
		return this.id == s.id && this.name.equals(s.name);
		
		
	}
}
