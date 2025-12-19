package setif;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class First {

/*
 * Set - cannot contain duplicate element
 * 
 * HashSet - 
 * - insertion order is not maintained
 * - no duplicates are allowed in hashSet
 * - only  1 null values are allowed
 * - initial cap. is 16 and load factor is 0.75
 * - hashSet is used to maintain uniqueness
 * - it add elements on the basis of hashCode (if hashcode is diff. then it will only add)
 * 
 * Internal Working - 
 * - 1st it will check hashcode and then equalness by .equals()
 * - if hashcode is same then it will check .equals()
 * - if hashcode is diff. then it will not check .equals() directly add element
 * */
	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<Integer>();
		
		
		set.add(5);
		set.add(1);

		set.add(3);
		set.add(3);
		set.add(8);
		set.add(2);
		set.add(null);
		set.add(null);
		
		
//		System.out.println(set);
		
		Set<String> set1 = new HashSet<String>();
		
		set1.add("vinayak");
		set1.add("akash");
		set1.add("vinayak");
		set1.add("shubham");
		
//		System.out.println(set1);
		
		Stud s1 = new Stud(1, "vinayak");
		Stud s2 = new Stud(1, "vinayak");
		
		Set<Stud> st = new HashSet<Stud>();
		st.add(s1);
		st.add(s2);
		System.out.println(st);
	
	}

}

class Stud{
	int id;
	String name;
	public Stud(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		return "id = "+ this.id + " name = "+ this.name;
	}
	
	public int hashCode() {
		return Objects.hash(this.id, this.name);
	}
	
	public boolean equals(Object o) {
		if(this == o) return true;
		
		if(this.getClass() != o.getClass()) return false;
		
		Stud s = (Stud)o;
		
		return this.id == s.id && this.name.equals(s.name);
	}
	
	
}
