package demo;

public class Demo {
	
/*String is non-primitive immutable
 *2 ways to create 
 *-using new keyword
 *-without new 
 *
 **/

	public static void main(String[] args) {
		
		String s1 = "vinayak";         //without new will stored in SCP   //if 
		
		String s2 = new String("vinayak");  // with new stored in heap but not in SCP
		
		//reff. stored in stack  i.e. (s1, s2)
		
		String s3 = "vinayak";
		
		System.out.println(s1==s3);    //if same value in SCP reff. will point to same value 
		
		
		String s4 =new String("vinayak");
		
		System.out.println(s2==s4);
		
		
		
		

	}

}
