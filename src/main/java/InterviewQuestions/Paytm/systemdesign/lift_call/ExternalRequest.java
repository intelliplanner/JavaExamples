package InterviewQuestions.Paytm.systemdesign.lift_call;

/** Purpose: Encapsulates external request behavior; it solves the represented coding problem. Owner: Virendra Gupta. */
public class ExternalRequest {
	private Direction directionToGo;
	private int sourceFloor;
	
	/** Purpose: Creates a external request instance. */
	public ExternalRequest(Direction directionToGo, int sourceFloor) {
		this.directionToGo = directionToGo;
		this.sourceFloor = sourceFloor;
	}
	
	/** Purpose: Retrieves get direction to go data. */
	public Direction getDirectionToGo() {
		return directionToGo;
	}
	
	/** Purpose: Updates set direction to go data. */
	public void setDirectionToGo(Direction directionToGo) {
		this.directionToGo = directionToGo;
	}
	
	/** Purpose: Retrieves get source floor data. */
	public int getSourceFloor() {
		return sourceFloor;
	}
	
	/** Purpose: Updates set source floor data. */
	public void setSourceFloor(int sourceFloor) {
		this.sourceFloor = sourceFloor;
	}
}
