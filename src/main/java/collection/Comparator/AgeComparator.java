package collection.Comparator;

import java.util.Comparator;

/**
 * Encapsulates age comparator behavior for collection data management and lookup.
 */
class AgeComparator implements Comparator<Student>{

	/**
 * Performs the compare operation required by the represented example.
 */
	public int compare(Student o1, Student o2) {
		if(o1.age == o2.age)
			return 0;
		else if(o1.age > o2.age)
			return 1;
		else
			return -1;
	}
	
}
