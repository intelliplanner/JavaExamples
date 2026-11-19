package ThreadExamples.synchronization;

/** Purpose: Encapsulates my thread2 behavior; it supports concurrent workflow execution. Owner: Virendra Gupta. */
public class MyThread2 extends Thread{
	Table t;
	
	/** Purpose: Creates a my thread2 instance. */
	public MyThread2(Table t) {
		this.t=t;
	}
	
	/** Purpose: Executes the run workflow. */
	public void run(){  
		t.printable(10);  
	}  
}
