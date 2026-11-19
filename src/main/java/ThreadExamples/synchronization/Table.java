package ThreadExamples.synchronization;

/**
 * Encapsulates table behavior for safe concurrent execution and shared-state coordination.
 */
public class Table {
	/**
 * Performs the printable operation required by the represented example.
 */
	synchronized public void printable(int i) {
		for (int j = 1; j < i; j++) {
			System.out.println(j);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
