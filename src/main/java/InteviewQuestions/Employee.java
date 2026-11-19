package InteviewQuestions;

/**
 * Encapsulates employee behavior for the represented coding problem.
 */
public class Employee {
	String name;
	
	@Override
	/**
 * Verifies hash code conditions before processing continues.
 */
	public int hashCode() {
		return 1;
	}
	
	/**
 * Supports reliable object comparison and collection lookup.
 */
	public boolean equals(Object o) {
		if(o == null) 
			return false;
		else if(!(o instanceof Employee))
			return false;
		else if(o==this)
			return true;
		
		return (this.getName() == ((Employee)o).getName()) ? true : false; 
	}
	/**
 * Creates a configured employee instance for the represented workflow.
 */
	public Employee(String name) {
		this.name = name;
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
