package collection.Comparable;

import lombok.Data;

/** Purpose: Encapsulates employee behavior; it manages collection data reliably. Owner: Virendra Gupta. */
public class Employee implements Comparable<Employee> {
	int age;
	int salary;
	String name;
	
	/** Purpose: Creates a employee instance. */
	public Employee(int age,int salary,String name){
		this.age=age;
		this.salary=salary;
		this.name=name;
	}
		
	@Override
	
	/** Purpose: Performs the compare to operation. */
	public int compareTo(Employee emp) {
		if(age==emp.age) 
			return 0;
		else if(age > emp.age) 
			return 1;
		else 
			return -1;
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

	/** Purpose: Retrieves get name data. */
	public String getName() {
		return name;
	}

	/** Purpose: Updates set name data. */
	public void setName(String name) {
		this.name = name;
	}

}
