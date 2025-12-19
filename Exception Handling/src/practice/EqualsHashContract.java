package practice;

import java.util.Objects;

public class EqualsHashContract {

	public static void main(String[] args) {
		Student s = new Student(12, "vinayak");
		Student s1 = new Student(12, "vinayak");
		
		System.out.println(s.equals(s1));
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());

	}

}

class Student {
	int age;
	String name;
	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	public int hashCode() {
		return Objects.hash(this.age, this.name);
	}
	
	public boolean equals(Object o) {
		if(this == o) return true;
		
		if(this.getClass() != o.getClass())
			return false;
		
		Student s = (Student) o;
		
		return this.age == s.age && this.name.equals(s.name);
	} 
	
	

	
}
