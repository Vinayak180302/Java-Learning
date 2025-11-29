package map;

import java.util.ArrayList;
import java.util.List;

public class Map5 {

	public static void main(String[] args) {
		List<Employee> li = new ArrayList<Employee>();
		li.add(new Employee("vinayak", 50000));
		li.add(new Employee("om", 45000));
		li.add(new Employee("akash", 60000));
		
//		Convert Employee → only salary list
		li.stream().map((i)->{return i.salary;}).forEach((i)->{System.out.println(i);});
				
				
	}

}


class Employee{
	String name;
	int salary;
	
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String toString() {
		return this.name + " " + this.salary;
	}
	
	
}