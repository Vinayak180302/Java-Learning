package Assignment1;

import java.util.List;

public class Ninth {

	public static void main(String[] args) {
		
		List <Integer> li = List.of(1,2,3);
		
		try {
		li.add(5);
		}
		catch(UnsupportedOperationException e) {
			System.out.println(e.getMessage());
		}

	}

	
	}


