public class Car extends Vehicle {

    private int steeringWheel;
    private int windowWipers;
    private int battery;
    private boolean electric;

    public Car(String engine, int doors, int weight, int steeringWheel, int windowWipers, int battery, boolean electric) {
        super(engine, 4, "Default", doors, weight);
        this.steeringWheel = steeringWheel;
        this.windowWipers = windowWipers;
        this.battery = battery;
        this.electric = electric;
    }

    @Override
    public void move(int normalSpeed) {
        super.move(normalSpeed);
        System.out.println("Moving at a normal speed: " + normalSpeed);
        race(100);
        park(5);
    }

    public void race(int normalSpeed) {
        System.out.println("Moving at a racing speed : "+ normalSpeed);
    }

    public void park(int normalSpeed) {
        System.out.println("Parking : "+ normalSpeed);
    }

    public int getSteeringWheel() {
        return steeringWheel;
    }

    public int getWindowWipers() {
        return windowWipers;
    }

    public int getBattery() {
        return battery;
    }

    public boolean isElectric() {
        return electric;
    }
}
