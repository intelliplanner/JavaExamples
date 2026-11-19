package InterviewQuestions.Paytm.systemdesign.lift_call_new;

import InterviewQuestions.Paytm.systemdesign.lift_call.Request;

/** Purpose: Encapsulates add job worker behavior; it solves the represented coding problem. Owner: Virendra Gupta. */
public class AddJobWorker implements Runnable {

	private ElevatorNew elevator;
	private Request request;

	/** Purpose: Creates a add job worker instance. */
	AddJobWorker(ElevatorNew elevator, Request request) {
		this.elevator = elevator;
		this.request = request;
	}

	@Override
	
	/** Purpose: Executes the run workflow. */
	public void run() {

		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		elevator.addJob(request);
	}

}