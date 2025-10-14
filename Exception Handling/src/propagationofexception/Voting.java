package propagationofexception;

public class Voting {

	public static void main(String[] args) {
		Voting_day.castVote(12, false);

	}

}

class Voting_day {
	
	public static void castVote(int age, boolean isIndian) {
		try {
			if(age<18) {
				throw new invalidageException("age is below 18");
			}
		}
		catch(invalidageException e) {
			System.out.println(e.getMessage());
		}
		
		try {
		if(age < 18 && isIndian == false) {
			throw new notIndianException();
		}
		}
		catch(notIndianException e) {
			System.out.println(e.getMessage());
		}
	}
}