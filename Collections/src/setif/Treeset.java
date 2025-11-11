package setif;

import java.util.Set;
import java.util.TreeSet;

public class Treeset {

/*
 * TreeSet - 
 * - gives sorted set of element by default
 * - also maintain uniqueness (no duplicates allowed)
 * - Null is not allowed (Throw NullPointerException)
 * */
	public static void main(String[] args) {
		
		Set<Integer> tree = new TreeSet<Integer>();
		
//		tree.add(null);      // Null is not allowed in Tree
		tree.add(3);
		tree.add(4);
		tree.add(1);
		tree.add(1);
		tree.add(6);
		
		
		System.out.println(tree);
		

	}

}