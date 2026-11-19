package DesignPattern.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Encapsulates grab information behavior for a reusable object-interaction design.
 */
public class GrabInformation implements Flipkart {

	
	List<Observer> observerList = null;
	double tvPrice = 0;
	boolean isAvailable=false;
	
	/**
 * Creates a configured grab information instance for the represented workflow.
 */
	GrabInformation(){
		observerList=new ArrayList<>();
	}
	@Override
	/**
 * Adds add observer information required by the workflow.
 */
	public void addObserver(Observer addObserver) {
		observerList.add(addObserver);
		System.out.println("Add New Observer");
	}

	
	/**
 * Updates set tv price while keeping domain data consistent.
 */
	public void setTvPrice(double tvPrice) {
		this.tvPrice = tvPrice;
		 notifyObserver();
	}

	/**
 * Updates set available while keeping domain data consistent.
 */
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
		 notifyObserver();
	}
	@Override
	/**
 * Removes remove observer data so only valid workflow entries remain.
 */
	public void removeObserver(Observer removeObserver) {
		int index = observerList.indexOf(removeObserver);
		System.out.println("Remove Observer"+index+1);
		observerList.remove(index);
	}

	@Override
	/**
 * Performs the notify observer operation required by the represented example.
 */
	public void notifyObserver() {
		for(Observer observer: observerList)
			observer.updateInformation(isAvailable, tvPrice);
		
	}
	
}
