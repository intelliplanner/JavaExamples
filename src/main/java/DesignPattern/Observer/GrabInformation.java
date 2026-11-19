package DesignPattern.Observer;

import java.util.ArrayList;
import java.util.List;

/** Purpose: Encapsulates grab information behavior; it demonstrates reusable object interaction. Owner: Virendra Gupta. */
public class GrabInformation implements Flipkart {

	List<Observer> observerList = null;
	double tvPrice = 0;
	boolean isAvailable=false;

	/** Purpose: Creates a grab information instance. */
	GrabInformation(){
		observerList=new ArrayList<>();
	}
	@Override
	
	/** Purpose: Adds add observer data. */
	public void addObserver(Observer addObserver) {
		observerList.add(addObserver);
		System.out.println("Add New Observer");
	}

	
	/** Purpose: Updates set tv price data. */
	public void setTvPrice(double tvPrice) {
		this.tvPrice = tvPrice;
		 notifyObserver();
	}

	/** Purpose: Updates set available data. */
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
		 notifyObserver();
	}
	@Override
	
	/** Purpose: Removes remove observer data. */
	public void removeObserver(Observer removeObserver) {
		int index = observerList.indexOf(removeObserver);
		System.out.println("Remove Observer"+index+1);
		observerList.remove(index);
	}

	@Override
	
	/** Purpose: Performs the notify observer operation. */
	public void notifyObserver() {
		for(Observer observer: observerList)
			observer.updateInformation(isAvailable, tvPrice);
		
	}
	
}
