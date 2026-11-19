package InteviewQuestions;

/**
 * Encapsulates student behavior for the represented coding problem.
 */
public class Student implements Comparable<String>{

	String name;
	/**
 * Creates a configured student instance for the represented workflow.
 */
	public Student(String name) {
		this.name=name;
	}
	@Override
	/**
 * Performs the compare to operation required by the represented example.
 */
	public int compareTo(String n) {
		if(name.equals(n))
			return 0;
		else
			return -1;
	}
	

	
}
