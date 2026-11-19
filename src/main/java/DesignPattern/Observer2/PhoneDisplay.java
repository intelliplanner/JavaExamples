package DesignPattern.Observer2;

/**
 * Encapsulates phone display behavior for a reusable object-interaction design.
 */
public class PhoneDisplay implements Observer {
    private String weather;

    @Override
    /**
 * Updates update while keeping domain data consistent.
 */
    public void update(String weather) {
        this.weather = weather;
        display();
    }

    /**
 * Performs the display operation required by the represented example.
 */
    private void display() {
        System.out.println("Phone Display: Weather updated - " + weather);
    }
}