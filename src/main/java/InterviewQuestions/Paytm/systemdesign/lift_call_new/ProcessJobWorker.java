package InterviewQuestions.Paytm.systemdesign.lift_call_new;

/**
 * Encapsulates process job worker behavior for the represented coding problem.
 */
public class ProcessJobWorker implements Runnable {

	private ElevatorNew elevator;

	/**
 * Creates a configured process job worker instance for the represented workflow.
 */
	ProcessJobWorker(ElevatorNew elevator) {
		this.elevator = elevator;
	}

	@Override
	/**
 * Executes run processing and coordinates the required workflow.
 */
	public void run() {
		/**
		 * start the elevator
		 */
		elevator.startElevator();
	}

}
