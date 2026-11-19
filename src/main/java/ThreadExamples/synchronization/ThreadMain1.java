package ThreadExamples.synchronization;

/**
 * Encapsulates thread main1 behavior for safe concurrent execution and shared-state coordination.
 */
public class ThreadMain1 {

		public static void main(String[] args) {
		Table t = new Table();
		MyThread1 m1 = new MyThread1(t);
		m1.setName("m1");
		MyThread2 m2 = new MyThread2(t);
		m2.setName("m2");
		m1.start();
		m2.start();
	}

}
