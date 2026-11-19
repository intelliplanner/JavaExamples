package InterviewQuestions.Paytm;

/**
 * Encapsulates parking info behavior for the represented coding problem.
 */
public class ParkingInfo {
	int parkingSeq;
	String alotForVehicleType;
//	int entryPoint;
	int entryPointNo;
	int exitPoint;
	boolean isBusy;
	
	/**
 * Creates a configured parking info instance for the represented workflow.
 */
	public ParkingInfo(int parkingSeq, String alotForVehicleType, int entryPointNo, int exitPoint, boolean isBusy) {
		super();
		this.parkingSeq = parkingSeq;
		this.alotForVehicleType = alotForVehicleType;
		this.entryPointNo = entryPointNo;
		this.exitPoint = exitPoint;
		this.isBusy = isBusy;
	}
	/**
 * Retrieves or locates get parking seq data needed for decision-making.
 */
	public int getParkingSeq() {
		return parkingSeq;
	}
	/**
 * Updates set parking seq while keeping domain data consistent.
 */
	public void setParkingSeq(int parkingSeq) {
		this.parkingSeq = parkingSeq;
	}
	/**
 * Retrieves or locates get alot for vehicle type data needed for decision-making.
 */
	public String getAlotForVehicleType() {
		return alotForVehicleType;
	}
	/**
 * Updates set alot for vehicle type while keeping domain data consistent.
 */
	public void setAlotForVehicleType(String alotForVehicleType) {
		this.alotForVehicleType = alotForVehicleType;
	}
	/**
 * Retrieves or locates get entry point no data needed for decision-making.
 */
	public int getEntryPointNo() {
		return entryPointNo;
	}
	/**
 * Updates set entry point no while keeping domain data consistent.
 */
	public void setEntryPointNo(int entryPointNo) {
		this.entryPointNo = entryPointNo;
	}
	/**
 * Retrieves or locates get exit point data needed for decision-making.
 */
	public int getExitPoint() {
		return exitPoint;
	}
	/**
 * Updates set exit point while keeping domain data consistent.
 */
	public void setExitPoint(int exitPoint) {
		this.exitPoint = exitPoint;
	}
	/**
 * Verifies is busy conditions before processing continues.
 */
	public boolean isBusy() {
		return isBusy;
	}
	/**
 * Updates set busy while keeping domain data consistent.
 */
	public void setBusy(boolean isBusy) {
		this.isBusy = isBusy;
	}
	
}
