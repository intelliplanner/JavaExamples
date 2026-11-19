package InterviewQuestions.Paytm.systemdesign.lift_call_new;

import InterviewQuestions.Paytm.systemdesign.lift_call.Request;

/**
 * Encapsulates add job worker behavior for the represented coding problem.
 */
public class AddJobWorker implements Runnable {

	private ElevatorNew elevator;
	private Request request;

	/**
 * Creates a configured add job worker instance for the represented workflow.
 */
	AddJobWorker(ElevatorNew elevator, Request request) {
		this.elevator = elevator;
		this.request = request;
	}

	@Override
	/**
 * Executes run processing and coordinates the required workflow.
 */
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