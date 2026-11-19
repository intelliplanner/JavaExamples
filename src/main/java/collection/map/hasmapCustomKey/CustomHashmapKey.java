package collection.map.hasmapCustomKey;

/**
 * Encapsulates custom hashmap key behavior for collection data management and lookup.
 */
public class CustomHashmapKey {
	int rollno;
	String name;

	/**
 * Creates a configured custom hashmap key instance for the represented workflow.
 */
	public CustomHashmapKey(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}

	/**
 * Provides a readable representation for reporting or diagnostics.
 */
	public String toString() {
		return rollno + ", " + name;
	}

	@Override
	/**
 * Verifies hash code conditions before processing continues.
 */
	public int hashCode() {
		return this.rollno;
	}

	@Override
	/**
 * Supports reliable object comparison and collection lookup.
 */
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
