package arbitary;

import java.util.Arrays;
import java.util.List;

public class Custom {

	public static void main(String[] args) {
		List<Student> li = Arrays.asList(new Student(10, 20, 30), new Student(25, 65, 10), new Student(30, 20, 10));
		
		li.stream()
		.map(Student::avg)
		.forEach(System.out::println);

	}

}

class Student{
	int m1;
	int m2;
	int m3;
	
	public Student(int m1, int m2, int m3) {
		super();
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	
	public int avg() {
		return (m1 + m2 + m3)/3;
	}
	

	
	
	
}
