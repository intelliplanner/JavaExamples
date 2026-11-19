package InterviewQuestions.Paytm.systemdesign.lift_call;

/** Purpose: Encapsulates request behavior; it solves the represented coding problem. Owner: Virendra Gupta. */
public class Request implements Comparable<Request> {
	private InternalRequest internalRequest;
	private ExternalRequest externalRequest;

	/** Purpose: Creates a request instance. */
	public Request(InternalRequest internalRequest, ExternalRequest externalRequest) {
		this.internalRequest = internalRequest;
		this.externalRequest = externalRequest;
	}

	/** Purpose: Retrieves get internal request data. */
	public InternalRequest getInternalRequest() {
		return internalRequest;
	}

	/** Purpose: Updates set internal request data. */
	public void setInternalRequest(InternalRequest internalRequest) {
		this.internalRequest = internalRequest;
	}

	/** Purpose: Retrieves get external request data. */
	public ExternalRequest getExternalRequest() {
		return externalRequest;
	}

	/** Purpose: Updates set external request data. */
	public void setExternalRequest(ExternalRequest externalRequest) {
		this.externalRequest = externalRequest;
	}

	@Override
	
	/** Purpose: Performs the compare to operation. */
	public int compareTo(Request req) {
		if (this.getInternalRequest().getDestinationFloor() == req.getInternalRequest().getDestinationFloor())
			return 0;
		else if (this.getInternalRequest().getDestinationFloor() > req.getInternalRequest().getDestinationFloor())
			return 1;
		else
			return -1;
	}

}
