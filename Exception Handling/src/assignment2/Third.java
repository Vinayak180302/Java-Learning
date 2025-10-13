package assignment2;

public class Third {

	public static void main(String[] args) {
		String str = null;
		try{
		if(str == null) {
			throw new NullPointerException("name is null");
		}
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}

}
