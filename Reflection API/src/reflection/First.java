package reflection;


/*
 * Reflection API - 
 *  - it allows us to dynamically inspect/access, modify the behaviour of classes, meethods, fields
 *  - it also used to bypass the encapsulation 
 * */

/*
 * There are 3 ways to get info. about classes using Reflection - 
 *  1) using class name -
 *     Class<?> cl = className.class;
 *  
 *  2) if we know obj. - 
 *     Class<?> cl = obj.getclass;
 *     
 *  3) if we don't know obj - 
 *     Class<?> cl = Class.forName("Class packageName.className");
 * 
 * */
public class First {

	public static void main(String[] args) throws ClassNotFoundException {
// 1) using class name -
		
		Class<?> cl = First.class;
		
		System.out.println(cl);
		
// 2) if we know obj. -
		
		First f1 = new First();
		
		Class<?> cl1 = f1.getClass();
		
		System.out.println(cl1);
		
//  if we don't know obj - 
		Class<?> cl2 = Class.forName("reflection.First");
		
		System.out.println(cl2);
	}

}
