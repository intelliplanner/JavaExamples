package InterviewQuestions.Paytm.systemdesign.lift_call_new;

import InterviewQuestions.Paytm.systemdesign.lift_call.Direction;
import InterviewQuestions.Paytm.systemdesign.lift_call.ExternalRequest;
import InterviewQuestions.Paytm.systemdesign.lift_call.InternalRequest;
import InterviewQuestions.Paytm.systemdesign.lift_call.Request;

/** Purpose: Encapsulates test elevator behavior; it solves the represented coding problem. Owner: Virendra Gupta. */
public class TestElevator {
		
		public static void main(String args[]) {

		ElevatorNew elevator = new ElevatorNew();

		ProcessJobWorker processJobWorker = new ProcessJobWorker(elevator);
		Thread t2 = new Thread(processJobWorker);
		t2.start();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ExternalRequest er = new ExternalRequest(Direction.UP, 0);

		InternalRequest ir = new InternalRequest(5);

		Request request1 = new Request(ir, er);

		new Thread(new AddJobWorker(elevator, request1)).start();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
