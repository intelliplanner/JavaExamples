package ThreadExamples;

/**
 * Encapsulates shared behavior for safe concurrent execution and shared-state coordination.
 */
public class Shared {
	int count=0;
	/**
 * Performs the print operation required by the represented example.
 */
	public void print() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
}
