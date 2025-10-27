package interning;

public class Demo1 {

	public static void main(String[] args) {

//in case of string literals, interning happens automatically 
		String s1= "hello";    
		
		String s2 = "hello";
		
		System.out.println(s1 == s2);
		
		
	}

}
