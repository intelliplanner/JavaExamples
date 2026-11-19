package ThreadExamples.example1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/** Purpose: Encapsulates atomic variable behavior; it supports concurrent workflow execution. Owner: Virendra Gupta. */
public class AtomicVariable {
	Counter counter = new Counter();
	ExecutorService execute;

	/** Purpose: Performs the service operation. */
	public void service() {
		try {
			execute = Executors.newFixedThreadPool(2);
			Runnable task1 = () -> {
				for (int i = 0; i < 10; i++) {
					counter.increment();
					System.out.println("t1: "+counter.getCount());
				}
				
			};
			Runnable task2 = () -> {
				for (int i = 0; i < 10; i++) {
					counter.increment();
					System.out.println("t2: "+counter.getCount());
				}
			};

			execute.submit(task1);
			execute.submit(task2);
			execute.awaitTermination(1, TimeUnit.SECONDS);
			System.out.println(counter.getCount());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

		public static void main(String args[]) {
		AtomicVariable av = new AtomicVariable();
		av.service();
	}

}
