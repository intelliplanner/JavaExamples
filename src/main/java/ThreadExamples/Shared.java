package ThreadExamples;

/** Purpose: Encapsulates shared behavior; it supports concurrent workflow execution. Owner: Virendra Gupta. */
public class Shared {
	int count=0;
	
	/** Purpose: Performs the print operation. */
	public void print() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
}
