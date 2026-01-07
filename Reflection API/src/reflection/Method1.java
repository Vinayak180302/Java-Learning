package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
 * for accessing public methods
 * */
public class Method1 {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, InvocationTargetException, InstantiationException {
		
//		Demo1 d1 = new Demo1();
		
//get the class obj.
		Class<?> cl = Demo1.class;

//create obj. of class i.e instance of constructor
		Constructor<?> con = cl.getDeclaredConstructor();
		
		Demo1 d = (Demo1)con.newInstance();
		
//		Class<?> c = d.getClass();
		
//access method using - getDeclaredMethod(), getMethod() & match methodName in " " & match the parameters
		Method m = cl.getMethod("show");
		
// call the method using invoke() & pass the obj. in it	
		m.invoke(d);
		
		//to call method with parameters
		Method m1 = cl.getMethod("show", int.class, String.class);
		
		m1.invoke(d, 1,"vinayak");
		
	}

}

class Demo1{
	
	public void show() {
		System.out.println("public method");
	}
	
	public void show(int i, String j) {
		System.out.println("public method with parameters");
	}
}