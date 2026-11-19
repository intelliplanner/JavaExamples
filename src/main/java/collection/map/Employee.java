package collection.map;

/** Purpose: Encapsulates employee behavior; it manages collection data reliably. Owner: Virendra Gupta. */
public class Employee implements Comparable<Employee> {

    private Long id;
    
    /** Purpose: Retrieves get id data. */
    public Long getId() {
		return id;
	}

	/** Purpose: Updates set id data. */
	public void setId(Long id) {
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

	private String name;

    // constructor, getters, settersl̥

    /** Purpose: Creates a employee instance. */
    public Employee(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	// override equals and hashCode
    @Override
    
    /** Purpose: Performs the compare to operation. */
    public int compareTo(Employee employee) {
        return (int)(this.id - employee.getId());
    }
}
