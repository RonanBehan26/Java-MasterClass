public class VehicleTim {

    private String name;
    private String size;

    private int currentVelocity = 0;
    private int currentDirection = 0;

    public VehicleTim(String name, String size) {
        this.name = name;
        this.size = size;
    }

    public void steer(int direction){
        this.currentDirection = this.currentDirection + direction;
        System.out.println("Vehicle.steer(): Steering at " + currentDirection + " degrees");
    }

    public void move(int velocity, int direction){
        currentDirection = direction;
        currentVelocity = velocity;
        System.out.println("Vehicle.move(): Moving at " + currentVelocity + " in direction " + currentDirection);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setCurrentVelocity(int currentVelocity) {
        this.currentVelocity = currentVelocity;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }


    public void stop(){//just stops the vehicle
        this.currentVelocity = 0;
    }
}
