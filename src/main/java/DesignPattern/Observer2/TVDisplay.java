package DesignPattern.Observer2;

/**
 * Encapsulates tv display behavior for a reusable object-interaction design.
 */
class TVDisplay implements Observer {
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
        System.out.println("TV Display: Weather updated - " + weather);
    }
}