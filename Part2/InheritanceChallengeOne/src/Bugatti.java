public class Bugatti extends Car{

    private int hyperSpeed;
    private String owner;
    private String location;

    public Bugatti(String engine, int doors, int weight, int steeringWheel, int windowWipers, int battery, boolean electric, int hyperSpeed, String owner, String location) {
        super(engine, doors, weight, steeringWheel, windowWipers, battery, electric);
        this.hyperSpeed = hyperSpeed;
        this.owner = owner;
        this.location = location;
    }

    public void moveBugatti(int hyperSpeed) {
        System.out.println("HyperSpeed goes up to : " + hyperSpeed);
        changeGear();
        auctionTime();
    }

    public void changeGear() {
        System.out.println("Moving up a notch");
    }

    public void auctionTime() {
        System.out.println("We should put this up for auction");
    }


}
