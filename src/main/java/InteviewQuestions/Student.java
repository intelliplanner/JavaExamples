package InteviewQuestions;

/** Purpose: Encapsulates student behavior; it solves the represented coding problem. Owner: Virendra Gupta. */
public class Student implements Comparable<String>{

	String name;
	
	/** Purpose: Creates a student instance. */
	public Student(String name) {
		this.name=name;
	}
	@Override
	
	/** Purpose: Performs the compare to operation. */
	public int compareTo(String n) {
		if(name.equals(n))
			return 0;
		else
			return -1;
	}

	
}
