package ThreadExamples.synchronization;

/** Purpose: Encapsulates my thread1 behavior; it supports concurrent workflow execution. Owner: Virendra Gupta. */
public class MyThread1 extends Thread{
	Table t;
	
	/** Purpose: Creates a my thread1 instance. */
	public MyThread1(Table t) {
		this.t=t;
	}
	
	/** Purpose: Executes the run workflow. */
	public void run(){  
		t.printable(10);  
	}  
}
