package collection.Comparable;

import lombok.Data;


/**
 * Encapsulates employee behavior for collection data management and lookup.
 */
public class Employee implements Comparable<Employee> {
	int age;
	int salary;
	String name;
	/**
 * Creates a configured employee instance for the represented workflow.
 */
	public Employee(int age,int salary,String name){
		this.age=age;
		this.salary=salary;
		this.name=name;
	}
		
	@Override
	/**
 * Performs the compare to operation required by the represented example.
 */
	public int compareTo(Employee emp) {
		if(age==emp.age) 
			return 0;
		else if(age > emp.age) 
			return 1;
		else 
			return -1;
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

}
