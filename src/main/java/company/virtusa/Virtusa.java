package company.virtusa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** Purpose: Encapsulates employee behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
class Employee {
	int id;
	String name;
	int age;
	int salary;

	/** Purpose: Creates a employee instance. */
	public Employee(int id, String name, int age, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	/** Purpose: Retrieves get id data. */
	public int getId() {
		return id;
	}

	/** Purpose: Updates set id data. */
	public void setId(int id) {
		this.id = id;
	}

	/** Purpose: Retrieves get name data. */
	public String getName() {
		return name;
	}

	/** Purpose: Updates set name data. */
	public void setName(String name) {
		this.name = name;
	}

	/** Purpose: Retrieves get age data. */
	public int getAge() {
		return age;
	}

	/** Purpose: Updates set age data. */
	public void setAge(int age) {
		this.age = age;
	}

	/** Purpose: Retrieves get salary data. */
	public int getSalary() {
		return salary;
	}

	/** Purpose: Updates set salary data. */
	public void setSalary(int salary) {
		this.salary = salary;
	}

}

/** Purpose: Encapsulates virtusa behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
public class Virtusa {
		
		public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(1,"vicky",20,200000));
		empList.add(new Employee(2,"vicky1",20,10000));
		empList.add(new Employee(3,"vicky2",20,50000));
		empList.add(new Employee(4,"vicky3",20,60000));
		empList.add(new Employee(5,"vicky4",20,5000));
		Collections.sort(empList,
				(s1, s2) -> s1.getSalary() < s2.getSalary() ? 1 : s1.getSalary() == s2.getSalary() ? 0 : -1);
		for (Employee e : empList) {
			System.out.println(e.getId() + " ," + e.getAge() + " ," + e.getName() + " ," + e.getSalary());
		}
	}

}
