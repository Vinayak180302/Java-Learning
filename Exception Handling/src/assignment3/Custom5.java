package assignment3;

public class Custom5 {

	public static void main(String[] args) {
		
		int age = 15;
		
		try {
		if(age < 18) {
			throw new noRightToVoteException();
		}
		}
		catch(noRightToVoteException e) {
			System.out.println(e.getMessage());
		}

	}

}

class noRightToVoteException extends RuntimeException{
	
	public noRightToVoteException() {
		super("voter is underaged");
	}
}
