public class Vehicle {

    private String engine;
    private int wheels;
    private String lights;
    private int doors;
    private int weight;

    public Vehicle(String engine, int wheels, String lights, int doors, int weight) {
        this.engine = engine;
        this.wheels = wheels;
        this.lights = lights;
        this.doors = doors;
        this.weight = weight;
    }

    public void move(int normalSpeed){
        System.out.println("Vehicle.normalSpeed() called. Moving at " + normalSpeed);
    }

    public void pollute(int pollute){
        System.out.println("Vehicle.pollute() called. Polluting at " + pollute);
    }

    public void cost(double cost){
        System.out.println("Vehicle.cost() called. Costs " + cost);
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setLights(String lights) {
        this.lights = lights;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public String getLights() {
        return lights;
    }

    public int getDoors() {
        return doors;
    }

    public int getWeight() {
        return weight;
    }
}
