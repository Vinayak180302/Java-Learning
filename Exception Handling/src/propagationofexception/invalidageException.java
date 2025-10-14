package propagationofexception;

public class invalidageException extends RuntimeException {
      public invalidageException() {
    	  super("age is less than 18");
      }
      
      public invalidageException(String str) {
    	  super(str);
      }
}

class notIndianException extends RuntimeException{
	public notIndianException() {
		super("not indian");
	}
}

class isIndianException extends RuntimeException{
	public isIndianException() {
		super("u are not indian");
	}
}
