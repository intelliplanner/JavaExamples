package collection.Comparator;

import java.util.Comparator;

/** Purpose: Encapsulates age comparator behavior; it manages collection data reliably. Owner: Virendra Gupta. */
class AgeComparator implements Comparator<Student>{

	/** Purpose: Performs the compare operation. */
	public int compare(Student o1, Student o2) {
		if(o1.age == o2.age)
			return 0;
		else if(o1.age > o2.age)
			return 1;
		else
			return -1;
	}
	
}
