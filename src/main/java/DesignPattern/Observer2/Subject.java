package DesignPattern.Observer2;

public interface Subject {
    
    /** Purpose: Adds add observer data. */
    void addObserver(Observer observer);
    
    /** Purpose: Removes remove observer data. */
    void removeObserver(Observer observer);
    
    /** Purpose: Performs the notify observers operation. */
    void notifyObservers();
}
