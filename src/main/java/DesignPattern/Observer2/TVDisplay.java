package DesignPattern.Observer2;

/** Purpose: Encapsulates tv display behavior; it demonstrates reusable object interaction. Owner: Virendra Gupta. */
class TVDisplay implements Observer {
    private String weather;
 
    @Override
    
    /** Purpose: Updates update data. */
    public void update(String weather) {
        this.weather = weather;
        display();
    }

    /** Purpose: Performs the display operation. */
    private void display() {
        System.out.println("TV Display: Weather updated - " + weather);
    }
}