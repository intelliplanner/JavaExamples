package InterviewQuestions.Paytm;

/** Purpose: Encapsulates parking info behavior; it solves the represented coding problem. Owner: Virendra Gupta. */
public class ParkingInfo {
	int parkingSeq;
	String alotForVehicleType;
//	int entryPoint;
	int entryPointNo;
	int exitPoint;
	boolean isBusy;

	/** Purpose: Creates a parking info instance. */
	public ParkingInfo(int parkingSeq, String alotForVehicleType, int entryPointNo, int exitPoint, boolean isBusy) {
		super();
		this.parkingSeq = parkingSeq;
		this.alotForVehicleType = alotForVehicleType;
		this.entryPointNo = entryPointNo;
		this.exitPoint = exitPoint;
		this.isBusy = isBusy;
	}
	
	/** Purpose: Retrieves get parking seq data. */
	public int getParkingSeq() {
		return parkingSeq;
	}
	
	/** Purpose: Updates set parking seq data. */
	public void setParkingSeq(int parkingSeq) {
		this.parkingSeq = parkingSeq;
	}
	
	/** Purpose: Retrieves get alot for vehicle type data. */
	public String getAlotForVehicleType() {
		return alotForVehicleType;
	}
	
	/** Purpose: Updates set alot for vehicle type data. */
	public void setAlotForVehicleType(String alotForVehicleType) {
		this.alotForVehicleType = alotForVehicleType;
	}
	
	/** Purpose: Retrieves get entry point no data. */
	public int getEntryPointNo() {
		return entryPointNo;
	}
	
	/** Purpose: Updates set entry point no data. */
	public void setEntryPointNo(int entryPointNo) {
		this.entryPointNo = entryPointNo;
	}
	
	/** Purpose: Retrieves get exit point data. */
	public int getExitPoint() {
		return exitPoint;
	}
	
	/** Purpose: Updates set exit point data. */
	public void setExitPoint(int exitPoint) {
		this.exitPoint = exitPoint;
	}
	
	/** Purpose: Validates is busy conditions. */
	public boolean isBusy() {
		return isBusy;
	}
	
	/** Purpose: Updates set busy data. */
	public void setBusy(boolean isBusy) {
		this.isBusy = isBusy;
	}
	
}
