package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/*
 * to access public & private fields
 * 
 * */
public class Fields {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {

//get the class obj.
		Class<?> cl = Car2.class;

//create instance of obj. to use to access the field
		Constructor<?> con = cl.getDeclaredConstructor();
		
		Car2 cr = (Car2)con.newInstance();

//access the field using- getdeclaredField() & pass name of field in " "
		Field f = cl.getDeclaredField("name");
		
//access it using get() by passing obj. in it		
		System.out.println(f.get(cr));

//also set value of field using set() & pass obj & new value in parameter
		f.set(cr, "vinayak");     //to set with new value, use - set()
		
		System.out.println(f.get(cr));
		
		Field f2 = cl.getDeclaredField("id");

//to access private fields, set visibility using- setAccessible(true)
		f2.setAccessible(true);
		System.out.println(f2.get(cr));
		f2.set(cr, 25);
		System.out.println(f2.get(cr));
		

	}

}

class Car2 {
	private int id;
	String name;
	
	
	
	
}
