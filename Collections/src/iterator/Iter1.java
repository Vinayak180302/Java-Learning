package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iter1 {

	public static void main(String[] args) {
	
List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i < 10; i++) {
			list.add(i);
		}
		
		


		Iterator<Integer> itr = list.iterator();
		
		while(itr.hasNext()) { 
			
			System.out.println(itr.next());
			itr.remove();
		
			
		}

	}

}
