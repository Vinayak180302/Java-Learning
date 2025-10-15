package propagationandstatuscode;

public class Voting {

	public static void main(String[] args) {
		
		try {
			Vote.election(15);
		}
		catch(NoRighttoVoteException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCode());
			System.out.println("caused by :"+ e.getCause());
		}


	}

}

class Vote{
	
	public static void election(int age) throws NoRighttoVoteException {
		int minAge = 18;
		
		if(age < minAge) {
			throw new NoRighttoVoteException("your age is less", 100, new Throwable("age is below 18"));
		}
	}
}
