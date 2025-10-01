package Encapsulation;

public class Second {

	public static void main(String[] args) {
		Instagram i1 = new Instagram();
		i1.setPassword("vinay");
		String pass = i1.getPassword();
		System.out.println(pass);
	}

}

class Instagram{
	
	private String password;
	
	
	//Setter
	public void setPassword(String pass) {
		if(pass.length() > 5) {
			this.password = pass;
		}else {
		System.out.println("invalid password");
		}
	    }
	
	public String getPassword() {
		return this.password;
	}
}


