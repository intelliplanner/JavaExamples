package InterviewQuestions.ThreadExamples;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/** Purpose: Encapsulates my timer task behavior; it supports concurrent workflow execution. Owner: Virendra Gupta. */
class MyTimerTask extends TimerTask {
  
  /** Purpose: Executes the run workflow. */
  public void run() {
    System.out.println("Timer task executed.");
  }
}

/** Purpose: Encapsulates timer task test behavior; it supports concurrent workflow execution. Owner: Virendra Gupta. */
public class TimerTaskTest {
	 Timer timer;
	 Date d=new Date();
	 long fixedRate = 1000*10;
	 long nextScheduled; 
	  
	  /** Purpose: Creates a timer task test instance. */
	  public TimerTaskTest(int seconds) {
	    timer = new Timer();
	    timer.schedule(new RemindTask(), seconds * 1000);
	    timer.scheduleAtFixedRate(new RemindTask() , d, fixedRate);
	   
	  }

	  /** Purpose: Encapsulates remind task behavior; it supports concurrent workflow execution. Owner: Virendra Gupta. */
	  class RemindTask extends TimerTask {
	    
	    /** Purpose: Executes the run workflow. */
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
      