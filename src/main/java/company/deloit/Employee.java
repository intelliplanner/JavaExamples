package company.deloit;

/** Purpose: Encapsulates employee behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
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

	/** Purpose: Creates a employee instance. */
	public Employee(int id, int age, String name, String depart) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.depart = depart;
	}

	/** Purpose: Retrieves get id data. */
	public int getId() {
		return id;
	}

	/** Purpose: Updates set id data. */
	public void setId(int id) {
		this.id = id;
	}

	/** Purpose: Retrieves get age data. */
	public int getAge() {
		return age;
	}

	/** Purpose: Updates set age data. */
	public void setAge(int age) {
		this.age = age;
	}

	/** Purpose: Retrieves get name data. */
	public String getName() {
		return name;
	}

	/** Purpose: Updates set name data. */
	public void setName(String name) {
		this.name = name;
	}

	/** Purpose: Retrieves get depart data. */
	public String getDepart() {
		return depart;
	}

	/** Purpose: Updates set depart data. */
	public void setDepart(String depart) {
		this.depart = depart;
	}

}
