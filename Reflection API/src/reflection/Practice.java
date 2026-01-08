package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/*
 * change private field name to another if name is "Viraj"
 * */
public class Practice {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		Class<?> cl = Viraj.class;
		
		Constructor<?> con = cl.getDeclaredConstructor();
		con.setAccessible(true);
		
		Viraj v = (Viraj)con.newInstance();
		
		Field f = cl.getDeclaredField("name");
		
		f.setAccessible(true);
		System.out.println(f.get(v));
		
		if(f.get(v).equals("viraj")) {
			f.set(v, "Dimble");
		}
		
		System.out.println(f.get(v));
		
		
		
		
		
		

	}

}

class Viraj {
	private String name="viraj";
	
	private Viraj() {
		System.out.println("private ctr");
	}
	
	private void demo() {
		System.out.println("private method");
	}
}
