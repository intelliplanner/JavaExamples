package company.deloit;

/**
 * Encapsulates employee behavior for the represented company or real-world workflow.
 */
public class Employee {
	int id;
	int age;
//	int salary;
	String name;
	String depart;

//		
//	@Override
//	public int compareTo(Employee emp) {
//		if(age==emp.age) 
//			return 0;
//		else if(age > emp.age) 
//			return 1;
//		else 
//			return -1;
//	}

	public Employee(int id, int age, String name, String depart) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.depart = depart;
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
 * Retrieves or locates get depart data needed for decision-making.
 */
	public String getDepart() {
		return depart;
	}

	/**
 * Updates set depart while keeping domain data consistent.
 */
	public void setDepart(String depart) {
		this.depart = depart;
	}

	
}
