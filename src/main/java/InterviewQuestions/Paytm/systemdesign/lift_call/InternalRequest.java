package InterviewQuestions.Paytm.systemdesign.lift_call;

/**
 * Encapsulates internal request behavior for the represented coding problem.
 */
public class InternalRequest {
	private int destinationFloor;

	/**
 * Creates a configured internal request instance for the represented workflow.
 */
	public InternalRequest(int destinationFloor) {
		this.destinationFloor = destinationFloor;
	}

	/**
 * Retrieves or locates get destination floor data needed for decision-making.
 */
	public int getDestinationFloor() {
		return destinationFloor;
	}

	/**
 * Updates set destination floor while keeping domain data consistent.
 */
	public void setDestinationFloor(int destinationFloor) {
		this.destinationFloor = destinationFloor;
	}
}