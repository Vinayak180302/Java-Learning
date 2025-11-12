package setif;

import java.util.Set;
import java.util.TreeSet;



public class Treeset2 {

	public static void main(String args[]) {
		Set<String> tree = new TreeSet<String>();
		
		tree.add("vinayak");
		tree.add("om");
		tree.add("vinayak");
		tree.add("shubham");
		tree.add("akash");
		tree.add("akash");
		
		System.out.println(tree);
	}
}
