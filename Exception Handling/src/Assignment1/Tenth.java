package Assignment1;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

public class Tenth {

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		
		try {
		for(Integer i : arr) {
			arr.add(5);
		}
		}
		catch(ConcurrentModificationException e) {
			System.out.println(e.getMessage());
		}

	}

}
