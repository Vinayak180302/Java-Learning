package customException;

public class First {

	public static void main(String[] args) {
		try
		{
		if(10>5 && 40>30)
		{
			throw  new invalidDayException("demo 1");
		}
		
		
		}
		catch(invalidDayException ex)
		{ System.out.println(1);
			System.out.println(ex.getMessage());
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
		System.out.println("THE END");
	}

	}


class invalidDayException extends Exception{
	
	public invalidDayException() {     //if want to create custom exception with fix msg. use non-para ctr
		super("demo");
	}
	
	public invalidDayException(String str) {   //if want to create custom exception with dynamic  msg. use para ctr
		super(str);
	}
	
}