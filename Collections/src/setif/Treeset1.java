package setif;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;


/*
 * in custom classes - we must define how to compare them otherwise give classCastException
 * there are 2 ways to define custom sorting logic for obj. in custom class -
 * 1) Comparable<T> - Natural Ordering(one-way) (in same class)
 * 2) Comparator<T> - Custom Ordering (use separate class)
 * 
 * 1)Comparable<T> - we can provide only one way for comparison(define logic on only one value in same class)
 * */
public class Treeset1 {

	public static void main(String[] args) {
		
		Set<Student1> tree = new TreeSet<Student1>();
		
		tree.add(new Student1(3, "chdasg"));
		tree.add(new Student1(2, "dkadss"));
		tree.add(new Student1(1, "aa"));
		tree.add(new Student1(3, "b"));
		
		System.out.println(tree);

	}

}


class Student1 implements Comparable<Student1>{
	int id;
	String name;
	
	public Student1(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	
	
	@Override
	public int compareTo(Student1 o) {
		
		return this.id - o.id;
//		return this.name.compareTo(o.name);
//		return this.name.length() - o.name.length();
	}
	
	public String toString() {
		return "id = " + id + "name = "+ name ;
	}
	
	
}

class Idcomparator implements Comparator<Student1>{

	@Override
	public int compare(Student1 o1, Student1 o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.id, o2.id);
	}
	
}
