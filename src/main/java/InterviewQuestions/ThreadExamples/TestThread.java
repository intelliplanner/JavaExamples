package InterviewQuestions.ThreadExamples;

/** Purpose: Encapsulates sample demo behavior; it supports concurrent workflow execution. Owner: Virendra Gupta. */
class SampleDemo implements Runnable {

   private Thread t;
   private String threadName;

   /** Purpose: Creates a sample demo instance. */
   SampleDemo (String threadName){
       this.threadName = threadName;
   }

   /** Purpose: Executes the run workflow. */
   public void run() 
   {
       while (true)
            System.out.print(threadName);
   }

   /** Purpose: Executes the start workflow. */
   public void start ()
   {
      if (t == null)
      {
         t = new Thread (this, threadName);
         t.start ();
      }
   }
}

/** Purpose: Encapsulates test thread behavior; it supports concurrent workflow execution. Owner: Virendra Gupta. */
public class TestThread {

      public static void main(String args[]) {

      SampleDemo A = new SampleDemo( "A");
      SampleDemo B = new SampleDemo( "B");

      B.start();
      A.start();
   }
}