package Java8.Stream;

/**
 * Encapsulates employee behavior for the represented example workflow.
 */
public class Employee {
		int id;
		String name;
		String deparment;
		int salary;
		/**
 * Creates a configured employee instance for the represented workflow.
 */
		public Employee(int id, String name, String deparment, int salary) {
			super();
			this.id = id;
			this.name = name;
			this.deparment = deparment;
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
 * Retrieves or locates get deparment data needed for decision-making.
 */
		public String getDeparment() {
			return deparment;
		}
		/**
 * Updates set deparment while keeping domain data consistent.
 */
		public void setDeparment(String deparment) {
			this.deparment = deparment;
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
 * Provides a readable representation for reporting or diagnostics.
 */
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", deparment=" + deparment + ", salary=" + salary + "]";
		}
		
}
