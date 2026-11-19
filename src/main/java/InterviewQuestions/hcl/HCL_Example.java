package InterviewQuestions.hcl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** Purpose: Encapsulates employee behavior; it solves the represented coding problem. Owner: Virendra Gupta. */
class Employee implements Comparable<Employee> {
	int age;
	String name;
	int departmentId;
	int salary;

	/** Purpose: Creates a employee instance. */
	public Employee(int age, String name, int departmentId, int salary) {
		super();
		this.age = age;
		this.name = name;
		this.departmentId = departmentId;
		this.salary = salary;
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

	/** Purpose: Retrieves get department id data. */
	public int getDepartmentId() {
		return departmentId;
	}

	/** Purpose: Updates set department id data. */
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	/** Purpose: Retrieves get salary data. */
	public int getSalary() {
		return salary;
	}

	/** Purpose: Updates set salary data. */
	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	
	/** Purpose: Performs the compare to operation. */
	public int compareTo(Employee o) {
		if (this.salary > o.salary) {
			return 1;
		} else if (this.salary == o.salary) {
			return 0;
		} else {
			return -1;
		}

	}

}

/** Purpose: Encapsulates hcl_example behavior; it solves the represented coding problem. Owner: Virendra Gupta. */
public class HCL_Example {

		public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(25, "vir", 1, 10000));
		empList.add(new Employee(22, "oiu", 4, 30000));
		empList.add(new Employee(23, "ghd", 5, 20000));
		empList.add(new Employee(21, "qwert", 6, 60000));

		empList.forEach(a->System.out.println(a.getSalary()));
		
//		Collections.sort(empList);
		
		System.out.println("-------------------------------------------------------");
		empList.forEach(a->System.out.println(a.getSalary()));
		System.out.println("-------------------------------------------------------");
		  Employee max = Collections.max(empList);
		  System.out.println("ArrayList max value : " + max.getSalary());
		
		// empList.stream().filter(s -> s.getSalary() >
		// 10000).map(a->a.getName()).collect(Collectors.toList()).forEach(System.out::println);

		// empList.stream().reduce((s1,s2) -> s1.getSalary() >
		// s2.getSalary()).map(a->a.getName()).collect(Collectors.toList()).forEach(System.out::println);

		// empList.stream().filter(m -> m.getDepartmentId() ==
		// 6).map(a->a.getName()).collect(Collectors.toList()).forEach(System.out::println);

		// empList.stream().filter(m -> m.getDepartmentId() ==
		// 6).map(a->a.getName()).collect(Collectors.toList()).forEach(System.out.println(a))

	}

}
