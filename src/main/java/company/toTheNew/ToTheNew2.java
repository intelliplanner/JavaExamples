package company.toTheNew;



	/**
 * Encapsulates to the new2 behavior for the represented company or real-world workflow.
 */
	public class ToTheNew2 {
	    	    public static void main(String[] args) {
	        Thread t1 = new Thread(new Task());
	        Thread t2 = new Thread(new Task());
	        t1.setName("Thread1");
	        t2.setName("Thread2");
	        t1.start();
	        t2.start();
	    }
	}

	/**
 * Encapsulates task behavior for the represented company or real-world workflow.
 */
	class Task implements Runnable{
	    /**
 * Executes run processing and coordinates the required workflow.
 */
	    public void run(){
	        synchronized (this)
	        {
	            System.out.println(Thread.currentThread().getName() + " have entered the synchronized block");
	            try {
	                Thread.sleep(5000);
//	                System.out.println("hello");
	            } catch (InterruptedException e) {
	                throw new RuntimeException(e);
	            }
	        }
	    }
	}


