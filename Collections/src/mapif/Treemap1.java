package mapif;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Treemap1 {

/*
 * using Comparable & Comparator in custom class for natural & Custom Sorting
 * 
 * */
	public static void main(String[] args) {
		
		Map<Student, Integer> map = new TreeMap<Student, Integer>(new IdComparator());
		
		map.put(new Student(1, "abc"), 10);
		map.put(new Student(4, "def"), 50);
		map.put(new Student(3, "xyz"), 20);
		map.put(new Student(1, "lmn"), 90);
		
		System.out.println(map);    //without implementing Comparable or Comparator - it will give ClassCastException
	}

}


class Student implements Comparable<Student>{
	int id;
	String name;
	
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		return this.id + "=" + this.name + " ";
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return Integer.compare(o.id, this.id);
	}
	
	
}


class IdComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return Integer.compare(o1.id, o2.id);
	}
	
}