package DesignPattern.Observer;

public interface Flipkart {// Subject that contains or manage observerlist
	
	/** Purpose: Adds add observer data. */
	void addObserver(Observer observer);
	
	/** Purpose: Removes remove observer data. */
	void removeObserver(Observer observer);
	
	/** Purpose: Performs the notify observer operation. */
	void notifyObserver();
	
}
