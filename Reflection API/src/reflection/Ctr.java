package reflection;

/*
 * Accessing Public Constructor using Reflection using methods- getDeclaredConstructor(), getConstructor()
 *  - we can access public constructor using Reflection API
 * 
 * */
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Ctr {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		//get the Class Object
		Class<?> cl = Demo.class;
		
		
		//it will give array of constructors present in given class
		Constructor<?>[] ctr = cl.getDeclaredConstructors();
		
//		for(Constructor<?> c : ctr) {
//			System.out.println(c);
//		}
//		
		
		//get Constructor info. using getDeclaredConstructor(), getConstructor() & match the parameters type
		Constructor<?> con = cl.getDeclaredConstructor(int.class);
//		System.out.println(con);
		
		Constructor<?> con2 = cl.getConstructor(int.class, String.class);
		System.out.println(con2);
		
		  con2.newInstance(12, "vinayak");
		
		// at last create obj. using newInstance()
		Demo d = (Demo)con.newInstance(12);
		
		
   
	
		
		
	}
	

}


class Demo {
	int id;
	String name;
	
	public Demo() {
		System.out.println("parameter less ctr");
	}
	
	public Demo(int id) {
		System.out.println("ctr with 1 parameter");
	}
	
	public Demo(int id, String name) {
		System.out.println("ctr with 2 parameters");
	}
}
