package DesignPattern.Observer;

/**
 * Encapsulates information observer behavior for a reusable object-interaction design.
 */
public class InformationObserver implements Observer{

	static int infoObserverId = 0;
	double tvPrice = 0;
	boolean isAvailable=false;
	
	private Flipkart grabInfo;
	
	/**
 * Creates a configured information observer instance for the represented workflow.
 */
	public InformationObserver(Flipkart grabInfo) {
		this.grabInfo=grabInfo;
		this.infoObserverId = ++infoObserverId;
		System.out.println("New Observer Id:"+this.infoObserverId);
		this.grabInfo.addObserver(this);
	}

	/**
 * Performs the print info operation required by the represented example.
 */
	public void printInfo() {
		System.out.println("Information Observer [tvPrice=" + this.tvPrice + ", isAvailable=" + this.isAvailable + "]");
	}

	@Override
	/**
 * Updates update information while keeping domain data consistent.
 */
	public void updateInformation(boolean isAvailableTv, double tvPrice) {
		this.isAvailable=isAvailableTv;
		this.tvPrice=tvPrice;
		printInfo();
	}

	

}
