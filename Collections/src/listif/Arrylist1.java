package listif;

import java.util.ArrayList;
import java.util.List;

public class Arrylist1 {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList();
		
		for(int i=0; i<5; i++) {
			list1.add(i+1);
		}
		
		list1.add(56);
		System.out.println(list1);
//		System.out.println(list1[4]);      //not possible
		
	}

}
