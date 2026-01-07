package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Ctr1 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Class<?> con = Class.forName("reflection.Student");
		
		Constructor<?> c1 =con.getDeclaredConstructor(int.class, String.class);
		
		Student s = (Student)c1.newInstance(1, "vinayak");
		
		System.out.println(s.id);
		System.out.println(s.name);
 
	}

}

class Student {
	int id; 
	String name;
	
	public Student(int id, String name) {
		System.out.println("ctr with 2 parameters");
	}
}
