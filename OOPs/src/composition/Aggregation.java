package composition;

public class Aggregation {

	public static void main(String[] args) {
		Student s1 = new Student("vinayak");
		
		Teacher t1 = new Teacher("sir", s1);
		
		t1.show();
		
	}

}

class Student {
	String name;
	
	Student(String name){
		this.name = name;
	}
}

class Teacher{
	String teachername;
	Student s1;
	
	Teacher(String teachername, Student s1){
		this.teachername = teachername;
		this.s1 = s1;
		
	}
	
	void show() {
		  System.out.println(teachername + " teaches " + s1.name);
	}
}