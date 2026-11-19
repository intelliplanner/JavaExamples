package DesignPattern.Observer2;

public interface Subject {
    /**
 * Adds add observer information required by the workflow.
 */
    void addObserver(Observer observer);
    /**
 * Removes remove observer data so only valid workflow entries remain.
 */
    void removeObserver(Observer observer);
    /**
 * Performs the notify observers operation required by the represented example.
 */
    void notifyObservers();
}
