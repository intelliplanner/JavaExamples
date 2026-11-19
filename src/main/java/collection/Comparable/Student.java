package collection.Comparable;

import java.util.*;

/** Purpose: Encapsulates student behavior; it manages collection data reliably. Owner: Virendra Gupta. */
class Student implements Comparable<Student> {
	int rollno;
	String name;
	int age;

	/** Purpose: Creates a student instance. */
	Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	@Override
	
	/** Purpose: Performs the compare to operation. */
	public int compareTo(Student st) {
		if (age == st.age)
			return 0;
		else if (age > st.age)
			return 1;
		else
			return -1;
	}

}

