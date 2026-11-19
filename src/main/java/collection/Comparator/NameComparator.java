package collection.Comparator;

import java.util.Comparator;

/** Purpose: Encapsulates name comparator behavior; it manages collection data reliably. Owner: Virendra Gupta. */
public class NameComparator implements Comparator<Student> {

	/** Purpose: Performs the compare operation. */
	public int compare(Student o1, Student o2) {
		return o1.name.compareTo(o2.name);
	}
}
