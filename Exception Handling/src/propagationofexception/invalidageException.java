package propagationofexception;

public class invalidageException extends Exception {
      public invalidageException() {
    	  super("age is less than 18");
      }
      
      public invalidageException(String str) {
    	  super(str);
      }
}

class notIndianException extends Exception{
	public notIndianException() {
		super("not indian");
	}
}

class isIndianException extends Exception{
	public isIndianException() {
		super("u are not indian");
	}
}
