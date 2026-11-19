package InterviewQuestions.hcl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Encapsulates employee behavior for the represented coding problem.
 */
class Employee implements Comparable<Employee> {
	int age;
	String name;
	int departmentId;
	int salary;

	/**
 * Creates a configured employee instance for the represented workflow.
 */
	public Employee(int age, String name, int departmentId, int salary) {
		super();
		this.age = age;
		this.name = name;
		this.departmentId = departmentId;
		this.salary = salary;
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
 * Retrieves or locates get department id data needed for decision-making.
 */
	public int getDepartmentId() {
		return departmentId;
	}

	/**
 * Updates set department id while keeping domain data consistent.
 */
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
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

	@Override
	/**
 * Performs the compare to operation required by the represented example.
 */
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

/**
 * Encapsulates hcl_example behavior for the represented coding problem.
 */
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
