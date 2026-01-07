package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
 * for accessing private constructor - we just need to set accessibility using - setAccessible(true)
 * */
public class Privat_ctr {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
	Class<?> con = Stud.class;
	
	Constructor<?> ctr =con.getDeclaredConstructor(int.class, String.class);
	
	ctr.setAccessible(true);
	ctr.newInstance(1, "vinayak");
	

	}

}

class Stud {
	int id;
	String name;
	
	private Stud(int id, String name) {
		System.out.println("private ctr");
	}
}
