package ThreadInterview;

/** Purpose: Encapsulates thread example behavior; it supports concurrent workflow execution. Owner: Virendra Gupta. */
public class ThreadExample {

		public static void main(String[] args) {
		ThreadRunnable r1 = new ThreadRunnable(1);
		ThreadRunnable r2 = new ThreadRunnable(2);
		ThreadRunnable r3 = new ThreadRunnable(0);
		Thread t1 = new Thread(r3,"Thread-3");
		Thread t2 = new Thread(r2,"Thread-2");
		Thread t3 = new Thread(r1,"Thread-1");
		t1.start();
		t2.start();
		t3.start();
	}

}

/** Purpose: Encapsulates thread runnable behavior; it supports concurrent workflow execution. Owner: Virendra Gupta. */
class ThreadRunnable implements Runnable {
	static Object lock = new Object();
	static int number = 1;
	int totalcount = 10;
	int remainder;
	int noOfThreads = 3;

	/** Purpose: Creates a thread runnable instance. */
	ThreadRunnable(int remainder) {
		this.remainder = remainder;
	}

	@Override
	
	/** Purpose: Executes the run workflow. */
	public void run() {

		while (number < totalcount-1) {
			synchronized (lock) {
				while (number % noOfThreads != remainder) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				lock.notifyAll();
				System.out.println(Thread.currentThread().getName() + ": " + number);
				number++;
			}

		}
	}

}