package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
 * for accessing private methods
 * 
 * */
public class Method2 {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		//create obj. 
		Class<?> cl = Car.class;
		
		Constructor<?> con = cl.getDeclaredConstructor();
		
		Car c1 = (Car)con.newInstance();
		
		//now call method 
		
		Method m1 = cl.getDeclaredMethod("show", int.class, int.class);
		
		m1.setAccessible(true);
		m1.invoke(c1, 1, 2);
		

	}

}

class Car{
	
	private void show(int i, int j) {
		System.out.println("private method");
		
	}
}
