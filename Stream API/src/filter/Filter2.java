package filter;

import java.util.ArrayList;
import java.util.List;

/*
 * using custom class - 
 * */
public class Filter2 {

	public static void main(String[] args) {
		List<Student> li = new ArrayList<Student>();
		li.add(new Student(75, "vinayak"));
		li.add(new Student(85, "Raj"));
		li.add(new Student(45, "om"));
		li.add(new Student(65, "shubham"));
		li.add(new Student(38, "akash"));
		
		
		//print students whose marks > 40
		li.stream().filter((i)->{return i.marks > 40;}).forEach((i)->{System.out.println(i);});
		
		System.out.println("*******************");
		
		//print name of student whose name start with "R" in uppercase
		li.stream().filter((i)->{return i.name.startsWith("R");}).forEach((i)->{System.out.println(i.name.toUpperCase());});

	}

}

class Student{
	int marks;
	String name;
	
	public Student(int marks, String name) {
	  this.marks = marks;
	  this.name = name;
	}
	
	public String toString() {
		return "marks = " + marks + ", name = " + name;
		
	}
}
