package collection.map;

public class Employee implements Comparable<Employee> {

    private Long id;
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

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
    public int compareTo(Employee employee) {
        return (int)(this.id - employee.getId());
    }
}
