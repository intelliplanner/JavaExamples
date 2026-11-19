package Java8.Stream;

/** Purpose: Encapsulates employee behavior; it demonstrates Java 8 behavior. Owner: Virendra Gupta. */
public class Employee {
		int id;
		String name;
		String deparment;
		int salary;
		
		/** Purpose: Creates a employee instance. */
		public Employee(int id, String name, String deparment, int salary) {
			super();
			this.id = id;
			this.name = name;
			this.deparment = deparment;
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
		
		/** Purpose: Retrieves get deparment data. */
		public String getDeparment() {
			return deparment;
		}
		
		/** Purpose: Updates set deparment data. */
		public void setDeparment(String deparment) {
			this.deparment = deparment;
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
		
		/** Purpose: Provides a readable object representation. */
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", deparment=" + deparment + ", salary=" + salary + "]";
		}
		
}
