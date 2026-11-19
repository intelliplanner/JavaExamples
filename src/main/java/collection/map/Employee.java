package collection.map;

/**
 * Encapsulates employee behavior for collection data management and lookup.
 */
public class Employee implements Comparable<Employee> {

    private Long id;
    /**
 * Retrieves or locates get id data needed for decision-making.
 */
    public Long getId() {
		return id;
	}

	/**
 * Updates set id while keeping domain data consistent.
 */
	public void setId(Long id) {
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

	private String name;

    // constructor, getters, settersl̥

    public Employee(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	// override equals and hashCode
    @Override
    /**
 * Performs the compare to operation required by the represented example.
 */
    public int compareTo(Employee employee) {
        return (int)(this.id - employee.getId());
    }
}
