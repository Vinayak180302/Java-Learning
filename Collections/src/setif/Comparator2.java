package setif;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Comparator2 {
/*
 * we create diff. classes with diff. logic for sorting and adding elements
 * just need use the reff. of those classes in TreeSet constructor on which we need to sort and add elements
 * */
	public static void main(String[] args) {
		
		Set<Student2> tree  = new TreeSet<Student2>(new MarksComparator());
		tree.add(new Student2(5, "Vinayak", 45.1));
		tree.add(new Student2(1, "Akash", 21.12));
		tree.add(new Student2(6, "Om", 87.24));
		tree.add(new Student2(3, "Raj", 65.52));
		tree.add(new Student2(2, "Shubham", 81.14));
		
		System.out.println(tree);
		
		
	
	}

}

class Student2 implements Comparable<Student2>{
	int id; 
	String name; 
	Double marks;
	
	
	public Student2(int id, String name, Double marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	
	public String toString() {
		return "id =" + id + " name =" + name;
	}


	@Override
	public int compareTo(Student2 o) {
		
		return this.id - o.id;
	}
	
	
	
}

class IdComparator implements Comparator<Student2>{

	@Override
	public int compare(Student2 o1, Student2 o2) {
		
		return o2.id - o1.id;
	}
	
}

class NameComparator implements Comparator<Student2>{

	@Override
	public int compare(Student2 o1, Student2 o2) {
		
		return o1.name.length() - o2.name.length();
	}
	
}

class MarksComparator implements Comparator<Student2>{

	@Override
	public int compare(Student2 o1, Student2 o2) {
		
		return o1.marks.compareTo(o2.marks);
	}
	
}
