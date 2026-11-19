package InterviewQuestions.ThreadExamples;


/**
 * Encapsulates sample demo behavior for safe concurrent execution and shared-state coordination.
 */
class SampleDemo implements Runnable {

   private Thread t;
   private String threadName;
   
   /**
 * Creates a configured sample demo instance for the represented workflow.
 */
   SampleDemo (String threadName){
       this.threadName = threadName;
   }

   /**
 * Executes run processing and coordinates the required workflow.
 */
   public void run() 
   {
       while (true)
            System.out.print(threadName);
   }

   /**
 * Executes start processing and coordinates the required workflow.
 */
   public void start ()
   {
      if (t == null)
      {
         t = new Thread (this, threadName);
         t.start ();
      }
   }
}

/**
 * Encapsulates test thread behavior for safe concurrent execution and shared-state coordination.
 */
public class TestThread {

      public static void main(String args[]) {

      SampleDemo A = new SampleDemo( "A");
      SampleDemo B = new SampleDemo( "B");

      B.start();
      A.start();
   }
}