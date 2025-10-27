package interning;

public class Demo2 {

	public static void main(String[] args) {
		
		
//in case of new keyword interning not happened automatically
		
		String s1 = new String("hello");
		
		String s2 = s1.intern();   //moves reference to pool
		
		String s3 = "hello";   
		
		System.out.println(s2 == s3);
	}

}
