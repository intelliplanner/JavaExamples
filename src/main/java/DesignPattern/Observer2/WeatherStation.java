package DesignPattern.Observer2;

import java.util.ArrayList;
import java.util.List;

/** Purpose: Encapsulates weather station behavior; it demonstrates reusable object interaction. Owner: Virendra Gupta. */
public class WeatherStation implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String weather;

    @Override
    
    /** Purpose: Adds add observer data. */
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    
    /** Purpose: Removes remove observer data. */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    
    /** Purpose: Performs the notify observers operation. */
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(weather);
        }
    }

    /** Purpose: Updates set weather data. */
    public void setWeather(String newWeather) {
        this.weather = newWeather;
        notifyObservers();
    }
}