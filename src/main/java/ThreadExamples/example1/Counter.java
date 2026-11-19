package ThreadExamples.example1;

/** Purpose: Encapsulates counter behavior; it supports concurrent workflow execution. Owner: Virendra Gupta. */
public class Counter {
	public volatile int count = 0;

	/** Purpose: Retrieves get count data. */
	public int getCount() {
		return count;	
	}

	/** Purpose: Performs the increment operation. */
	public synchronized void increment() {
		count++;
	}
}
