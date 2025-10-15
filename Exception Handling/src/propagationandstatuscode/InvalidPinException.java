package propagationandstatuscode;

public class InvalidPinException extends Exception{
	private int code;
	public InvalidPinException(String str, int code, Throwable t) {
		super(str, t);
		this.code = code;
	}
	
	public int getCode() {
		return this.code;
	}

}

class InsufficientBalanceException extends Exception{
	
	private int code;
	public InsufficientBalanceException(String str, int code, Throwable t) {
		super(str, t);
		this.code = code;
	}
	
	public int getCode() {
		return this.code;
	}
}


class LimitReachException extends Exception{
	
	private int code;
	public LimitReachException(String str, int code, Throwable t) {
		super(str, t);
		this.code= code;
	}
	
	public int getCode() {
		return this.code;
	}
}