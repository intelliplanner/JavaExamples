package ThreadExamples.example1;

/**
 * Encapsulates counter behavior for safe concurrent execution and shared-state coordination.
 */
public class Counter {
	public volatile int count = 0;

	/**
 * Retrieves or locates get count data needed for decision-making.
 */
	public int getCount() {
		return count;	
	}

	/**
 * Performs the increment operation required by the represented example.
 */
	public synchronized void increment() {
		count++;
	}
}
