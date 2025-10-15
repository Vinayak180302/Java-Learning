package propagationandstatuscode;

public class NoRighttoVoteException extends Exception{
	
	private int code;
	
	public NoRighttoVoteException(String str, int code, Throwable t) {
		
		super(str, t);
		this.code = code;
	}
	
	public int getCode() {
		return this.code;
	}

}
