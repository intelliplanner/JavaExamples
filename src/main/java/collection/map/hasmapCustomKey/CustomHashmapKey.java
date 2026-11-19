package collection.map.hasmapCustomKey;

/** Purpose: Encapsulates custom hashmap key behavior; it manages collection data reliably. Owner: Virendra Gupta. */
public class CustomHashmapKey {
	int rollno;
	String name;

	/** Purpose: Creates a custom hashmap key instance. */
	public CustomHashmapKey(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}

	/** Purpose: Provides a readable object representation. */
	public String toString() {
		return rollno + ", " + name;
	}

	@Override
	
	/** Purpose: Validates hash code conditions. */
	public int hashCode() {
		return this.rollno;
	}

	@Override
	
	/** Purpose: Supports reliable object comparison. */
	public boolean equals(Object o) {
		if (this == o)
			return true;

		CustomHashmapKey other = (CustomHashmapKey) o;
		if (this.name == other.name)
			return true;

		if (this.rollno == other.rollno)
			return true;

		return false;
	}
	//
}
