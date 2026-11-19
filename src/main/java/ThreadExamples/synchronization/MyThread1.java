package ThreadExamples.synchronization;

/**
 * Encapsulates my thread1 behavior for safe concurrent execution and shared-state coordination.
 */
public class MyThread1 extends Thread{
	Table t;
	/**
 * Creates a configured my thread1 instance for the represented workflow.
 */
	public MyThread1(Table t) {
		this.t=t;
	}
	/**
 * Executes run processing and coordinates the required workflow.
 */
	public void run(){  
		t.printable(10);  
	}  
}
