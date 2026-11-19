package ThreadExamples.synchronization;

/** Purpose: Encapsulates thread main2 behavior; it supports concurrent workflow execution. Owner: Virendra Gupta. */
public class ThreadMain2 {

		public static void main(String[] args) {
		final Table obj=new Table();
		Thread t1= new Thread() {
			
			/** Purpose: Executes the run workflow. */
			public void run() {
				obj.printable(10);
			}
		};
		Thread t2= new Thread() {
			
			/** Purpose: Executes the run workflow. */
			public void run() {
				obj.printable(10);
			}
		};

		t1.start();
		t2.start();
	}

}
