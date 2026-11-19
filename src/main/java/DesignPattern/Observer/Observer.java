package DesignPattern.Observer;

public interface Observer {
	/**
 * Updates update information while keeping domain data consistent.
 */
	void updateInformation(boolean isAvailableTv, double tvPrice);
}
