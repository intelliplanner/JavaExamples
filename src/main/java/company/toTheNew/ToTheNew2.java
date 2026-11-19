package company.toTheNew;

	/** Purpose: Encapsulates to the new2 behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
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

	/** Purpose: Encapsulates task behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
	class Task implements Runnable{
	    
	    /** Purpose: Executes the run workflow. */
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

