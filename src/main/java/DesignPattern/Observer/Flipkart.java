package DesignPattern.Observer;

public interface Flipkart {// Subject that contains or manage observerlist
	/**
 * Adds add observer information required by the workflow.
 */
	void addObserver(Observer observer);
	/**
 * Removes remove observer data so only valid workflow entries remain.
 */
	void removeObserver(Observer observer);
	/**
 * Performs the notify observer operation required by the represented example.
 */
	void notifyObserver();
	
}
