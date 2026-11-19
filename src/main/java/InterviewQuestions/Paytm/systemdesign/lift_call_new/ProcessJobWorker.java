package InterviewQuestions.Paytm.systemdesign.lift_call_new;

/** Purpose: Encapsulates process job worker behavior; it solves the represented coding problem. Owner: Virendra Gupta. */
public class ProcessJobWorker implements Runnable {

	private ElevatorNew elevator;

	/** Purpose: Creates a process job worker instance. */
	ProcessJobWorker(ElevatorNew elevator) {
		this.elevator = elevator;
	}

	@Override
	
	/** Purpose: Executes the run workflow. */
	public void run() {
		
		elevator.startElevator();
	}

}
