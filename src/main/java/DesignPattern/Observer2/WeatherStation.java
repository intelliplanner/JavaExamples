package DesignPattern.Observer2;

import java.util.ArrayList;
import java.util.List;

/**
 * Encapsulates weather station behavior for a reusable object-interaction design.
 */
public class WeatherStation implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String weather;

    @Override
    /**
 * Adds add observer information required by the workflow.
 */
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    /**
 * Removes remove observer data so only valid workflow entries remain.
 */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    /**
 * Performs the notify observers operation required by the represented example.
 */
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(weather);
        }
    }

    /**
 * Updates set weather while keeping domain data consistent.
 */
    public void setWeather(String newWeather) {
        this.weather = newWeather;
        notifyObservers();
    }
}