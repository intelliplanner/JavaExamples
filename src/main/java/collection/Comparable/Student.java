package collection.Comparable;

import java.util.*;

/**
 * Encapsulates student behavior for collection data management and lookup.
 */
class Student implements Comparable<Student> {
	int rollno;
	String name;
	int age;

	/**
 * Creates a configured student instance for the represented workflow.
 */
	Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	@Override
	/**
 * Performs the compare to operation required by the represented example.
 */
	public int compareTo(Student st) {
		if (age == st.age)
			return 0;
		else if (age > st.age)
			return 1;
		else
			return -1;
	}

	
}

