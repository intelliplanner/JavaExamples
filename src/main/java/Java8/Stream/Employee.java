package Java8.Stream;

public class Employee {
		int id;
		String name;
		String deparment;
		int salary;
		public Employee(int id, String name, String deparment, int salary) {
			super();
			this.id = id;
			this.name = name;
			this.deparment = deparment;
			this.salary = salary;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDeparment() {
			return deparment;
		}
		public void setDeparment(String deparment) {
			this.deparment = deparment;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", deparment=" + deparment + ", salary=" + salary + "]";
		}
		
}
