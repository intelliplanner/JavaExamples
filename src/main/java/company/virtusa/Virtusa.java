package company.virtusa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Encapsulates employee behavior for the represented company or real-world workflow.
 */
class Employee {
	int id;
	String name;
	int age;
	int salary;

	/**
 * Creates a configured employee instance for the represented workflow.
 */
	public Employee(int id, String name, int age, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	/**
 * Retrieves or locates get id data needed for decision-making.
 */
	public int getId() {
		return id;
	}

	/**
 * Updates set id while keeping domain data consistent.
 */
	public void setId(int id) {
		this.id = id;
	}

	/**
 * Retrieves or locates get name data needed for decision-making.
 */
	public String getName() {
		return name;
	}

	/**
 * Updates set name while keeping domain data consistent.
 */
	public void setName(String name) {
		this.name = name;
	}

	/**
 * Retrieves or locates get age data needed for decision-making.
 */
	public int getAge() {
		return age;
	}

	/**
 * Updates set age while keeping domain data consistent.
 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
 * Retrieves or locates get salary data needed for decision-making.
 */
	public int getSalary() {
		return salary;
	}

	/**
 * Updates set salary while keeping domain data consistent.
 */
	public void setSalary(int salary) {
		this.salary = salary;
	}

}

/**
 * Encapsulates virtusa behavior for the represented company or real-world workflow.
 */
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
