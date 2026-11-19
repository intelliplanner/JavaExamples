package InterviewQuestions.Paytm.systemdesign.lift_call;

/** Purpose: Encapsulates internal request behavior; it solves the represented coding problem. Owner: Virendra Gupta. */
public class InternalRequest {
	private int destinationFloor;

	/** Purpose: Creates a internal request instance. */
	public InternalRequest(int destinationFloor) {
		this.destinationFloor = destinationFloor;
	}

	/** Purpose: Retrieves get destination floor data. */
	public int getDestinationFloor() {
		return destinationFloor;
	}

	/** Purpose: Updates set destination floor data. */
	public void setDestinationFloor(int destinationFloor) {
		this.destinationFloor = destinationFloor;
	}
}