package sorted;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
 * in custom class, 
 * -either we implements Comparable<> on same class (natural sorting) for sorting
 * - or we implements Comparator<> on different class (custom sorting) for sorting
 * 
 * */
public class Custom1 {

	public static void main(String[] args) {
		List<Student> li = new ArrayList<Student>();
		
		li.add(new Student(1, "vinayak"));
		li.add(new Student(5, "om"));
		li.add(new Student(2, "akash"));
		li.add(new Student(4, "shubham"));
		li.add(new Student(3, "raj"));
		
		li.stream().sorted(new IdComparator()).forEach((i)->{System.out.println(i);});


	}
}

class Student implements Comparable<Student>{
	int id;
	String name;
	
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	
	public String toString() {
		return  this.id + " "+ this.name;
	}


	@Override
	public int compareTo(Student o) {
		
		return Integer.compare(this.id, o.id);
	}
}


class IdComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return Integer.compare(o2.id, o1.id);
	}
	
}

