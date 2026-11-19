package DesignPattern.Observer2;

/** Purpose: Encapsulates phone display behavior; it demonstrates reusable object interaction. Owner: Virendra Gupta. */
public class PhoneDisplay implements Observer {
    private String weather;

    @Override
    
    /** Purpose: Updates update data. */
    public void update(String weather) {
        this.weather = weather;
        display();
    }

    /** Purpose: Performs the display operation. */
    private void display() {
        System.out.println("Phone Display: Weather updated - " + weather);
    }
}