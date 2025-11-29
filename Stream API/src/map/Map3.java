package map;

import java.util.ArrayList;
import java.util.List;

public class Map3 {

	public static void main(String[] args) {
		List<Student> li = new ArrayList<Student>();
		li.add(new Student("vinayak", 86));
		li.add(new Student("om", 76));
		li.add(new Student("akash", 95));
		
//		Convert student list to only student names whose marks > 80		
		li.stream()
		.filter((i)->{return i.marks > 80;})
		.map((i)->{return i.name;}).forEach((i)->{System.out.println(i);});
	}

}

class Student{
	String name;
	int marks;
	
	
	public Student(String name, int marks) {
		
		this.name = name;
		this.marks = marks;
	}
	
	public String toString() {
		return this.name + " "+ this.marks;
	}
	
	
}
