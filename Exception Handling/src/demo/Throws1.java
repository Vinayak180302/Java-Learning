package demo;

public class Throws1 {

	public static void main(String[] args){
		int i =100;
		
		int j =0;
		
		try {
		if(i==100) {
			throw new RuntimeException("zero");
		}
		}
		catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}

}
