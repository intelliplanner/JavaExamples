package company.deloit;

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	
}
