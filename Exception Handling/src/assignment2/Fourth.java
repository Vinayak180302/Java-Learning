package assignment2;

public class Fourth {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3};
		int index = 4;
		try {
		if(index >= arr.length) {
			throw new ArrayIndexOutOfBoundsException("index is larger than actual array");
			
		}
		
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}

}
