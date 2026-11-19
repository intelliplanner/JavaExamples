package ThreadExamples.synchronization;

/**
 * Encapsulates my thread2 behavior for safe concurrent execution and shared-state coordination.
 */
public class MyThread2 extends Thread{
	Table t;
	/**
 * Creates a configured my thread2 instance for the represented workflow.
 */
	public MyThread2(Table t) {
		this.t=t;
	}
	/**
 * Executes run processing and coordinates the required workflow.
 */
	public void run(){  
		t.printable(10);  
	}  
}
