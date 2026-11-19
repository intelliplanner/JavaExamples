package InterviewQuestions.Paytm.systemdesign.lift_call;

/**
 * Encapsulates request behavior for the represented coding problem.
 */
public class Request implements Comparable<Request> {
	private InternalRequest internalRequest;
	private ExternalRequest externalRequest;

	/**
 * Creates a configured request instance for the represented workflow.
 */
	public Request(InternalRequest internalRequest, ExternalRequest externalRequest) {
		this.internalRequest = internalRequest;
		this.externalRequest = externalRequest;
	}

	/**
 * Retrieves or locates get internal request data needed for decision-making.
 */
	public InternalRequest getInternalRequest() {
		return internalRequest;
	}

	/**
 * Updates set internal request while keeping domain data consistent.
 */
	public void setInternalRequest(InternalRequest internalRequest) {
		this.internalRequest = internalRequest;
	}

	/**
 * Retrieves or locates get external request data needed for decision-making.
 */
	public ExternalRequest getExternalRequest() {
		return externalRequest;
	}

	/**
 * Updates set external request while keeping domain data consistent.
 */
	public void setExternalRequest(ExternalRequest externalRequest) {
		this.externalRequest = externalRequest;
	}

	@Override
	/**
 * Performs the compare to operation required by the represented example.
 */
	public int compareTo(Request req) {
		if (this.getInternalRequest().getDestinationFloor() == req.getInternalRequest().getDestinationFloor())
			return 0;
		else if (this.getInternalRequest().getDestinationFloor() > req.getInternalRequest().getDestinationFloor())
			return 1;
		else
			return -1;
	}

}
