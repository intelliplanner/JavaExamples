package InterviewQuestions.Paytm.systemdesign.lift_call;

/**
 * Encapsulates external request behavior for the represented coding problem.
 */
public class ExternalRequest {
	private Direction directionToGo;
	private int sourceFloor;
	/**
 * Creates a configured external request instance for the represented workflow.
 */
	public ExternalRequest(Direction directionToGo, int sourceFloor) {
		this.directionToGo = directionToGo;
		this.sourceFloor = sourceFloor;
	}
	/**
 * Retrieves or locates get direction to go data needed for decision-making.
 */
	public Direction getDirectionToGo() {
		return directionToGo;
	}
	/**
 * Updates set direction to go while keeping domain data consistent.
 */
	public void setDirectionToGo(Direction directionToGo) {
		this.directionToGo = directionToGo;
	}
	/**
 * Retrieves or locates get source floor data needed for decision-making.
 */
	public int getSourceFloor() {
		return sourceFloor;
	}
	/**
 * Updates set source floor while keeping domain data consistent.
 */
	public void setSourceFloor(int sourceFloor) {
		this.sourceFloor = sourceFloor;
	}
}
