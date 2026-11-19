package DesignPattern.Observer;

/** Purpose: Encapsulates information observer behavior; it demonstrates reusable object interaction. Owner: Virendra Gupta. */
public class InformationObserver implements Observer{

	static int infoObserverId = 0;
	double tvPrice = 0;
	boolean isAvailable=false;
	
	private Flipkart grabInfo;

	/** Purpose: Creates a information observer instance. */
	public InformationObserver(Flipkart grabInfo) {
		this.grabInfo=grabInfo;
		this.infoObserverId = ++infoObserverId;
		System.out.println("New Observer Id:"+this.infoObserverId);
		this.grabInfo.addObserver(this);
	}

	/** Purpose: Performs the print info operation. */
	public void printInfo() {
		System.out.println("Information Observer [tvPrice=" + this.tvPrice + ", isAvailable=" + this.isAvailable + "]");
	}

	@Override
	
	/** Purpose: Updates update information data. */
	public void updateInformation(boolean isAvailableTv, double tvPrice) {
		this.isAvailable=isAvailableTv;
		this.tvPrice=tvPrice;
		printInfo();
	}

}
