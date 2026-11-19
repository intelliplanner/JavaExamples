package ThreadExamples.synchronization;

/**
 * Encapsulates thread main2 behavior for safe concurrent execution and shared-state coordination.
 */
public class ThreadMain2 {

		public static void main(String[] args) {
		final Table obj=new Table();
		Thread t1= new Thread() {
			/**
 * Executes run processing and coordinates the required workflow.
 */
			public void run() {
				obj.printable(10);
			}
		};
		Thread t2= new Thread() {
			/**
 * Executes run processing and coordinates the required workflow.
 */
			public void run() {
				obj.printable(10);
			}
		};
		


		t1.start();
		t2.start();
	}

}
