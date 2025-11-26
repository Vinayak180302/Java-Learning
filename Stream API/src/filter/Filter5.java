package filter;

import java.util.ArrayList;
import java.util.List;

public class Filter5 {

	public static void main(String[] args) {
		
		//print strings that contain letter "e"
		List<String> li = List.of("apple", "dog", "elephant", "cat");
		li.stream().filter((i)->{return i.contains("e");}).forEach((i)->{System.out.println(i);});
		
		System.out.println("**********************");
		
		//print employee whose salary >= 50k
		List<Employee> li1 = new ArrayList<Employee>();
		li1.add(new Employee("vinayak", 70000));
		li1.add(new Employee("om", 80000));
		li1.add(new Employee("akash", 45000));
		li1.add(new Employee("raj", 65000));
		li1.add(new Employee("shubham", 40000));
		li1.add(new Employee("viraj", 60000));
		
		li1.stream().filter((i)->{return i.salary >= 60000;}).forEach((i)->{System.out.println(i);});
		
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
		return "name = "+ name + ", salary = "+ salary;
	}
}
