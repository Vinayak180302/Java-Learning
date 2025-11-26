package filter;

import java.util.ArrayList;
import java.util.List;

public class Filter4 {

	public static void main(String[] args) {
		
		//print students name with marks > 60
		List<Students> li = new ArrayList<	Students>();
		li.add(new Students(54, "vinayak"));
		li.add(new Students(65, "viraj"));
		li.add(new Students(60, "om"));
		li.add(new Students(95, "shubham"));
		li.add(new Students(85, "akash"));
		
		li.stream().filter((i)->{return i.marks > 60;}).forEach((i)->{System.out.println(i.name);});
		
		System.out.println("*************");
		
		//Print students whose name starts with "a" and marks > 80
		li.stream().filter((i)->{return i.name.startsWith("a") && i.marks > 80;}).forEach((i)->{System.out.println(i);});
	}

}

class Students{
	int marks;
	String name;
	
	public Students(int marks, String name) {
		this.marks = marks;
		this.name = name;
	}
	
	public String toString() {
		return "name = "+ name + ", marks = "+ marks;
		
	}
}
