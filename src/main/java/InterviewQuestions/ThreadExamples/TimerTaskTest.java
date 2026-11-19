package InterviewQuestions.ThreadExamples;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Encapsulates my timer task behavior for safe concurrent execution and shared-state coordination.
 */
class MyTimerTask extends TimerTask {
  /**
 * Executes run processing and coordinates the required workflow.
 */
  public void run() {
    System.out.println("Timer task executed.");
  }
}

/**
 * Encapsulates timer task test behavior for safe concurrent execution and shared-state coordination.
 */
public class TimerTaskTest {
	 Timer timer;
	 Date d=new Date();
	 long fixedRate = 1000*10;
	 long nextScheduled; 
	  /**
 * Creates a configured timer task test instance for the represented workflow.
 */
	  public TimerTaskTest(int seconds) {
	    timer = new Timer();
	    timer.schedule(new RemindTask(), seconds * 1000);
	    timer.scheduleAtFixedRate(new RemindTask() , d, fixedRate);
	   
	  }

	  /**
 * Encapsulates remind task behavior for safe concurrent execution and shared-state coordination.
 */
	  class RemindTask extends TimerTask {
	    /**
 * Executes run processing and coordinates the required workflow.
 */
	    public void run() {
	    	 nextScheduled = new Date().getTime() + fixedRate; 
	      System.out.print("Time's up!:  Next Shcedule-" +nextScheduled);
	    //  timer.cancel(); //Terminate the timer thread
	    }
	  }

	  	  public static void main(String args[]) {
	    System.out.println("About to schedule task.");
	    new TimerTaskTest(5);
	    System.out.println("Task scheduled.");
	  }
}
      