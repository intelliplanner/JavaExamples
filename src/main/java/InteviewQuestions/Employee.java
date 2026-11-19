package InteviewQuestions;

/** Purpose: Encapsulates employee behavior; it solves the represented coding problem. Owner: Virendra Gupta. */
public class Employee {
	String name;
	
	@Override
	
	/** Purpose: Validates hash code conditions. */
	public int hashCode() {
		return 1;
	}

	/** Purpose: Supports reliable object comparison. */
	public boolean equals(Object o) {
		if(o == null) 
			return false;
		else if(!(o instanceof Employee))
			return false;
		else if(o==this)
			return true;
		
		return (this.getName() == ((Employee)o).getName()) ? true : false; 
	}
	
	/** Purpose: Creates a employee instance. */
	public Employee(String name) {
		this.name = name;
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
