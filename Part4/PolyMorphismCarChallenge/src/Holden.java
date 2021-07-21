public class Holden extends Car {

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return this.getClass().getSimpleName() + " Holden is starting";
    }

    @Override
    public String accelerate() {
        return this.getClass().getSimpleName() + " Hold is accelerating";
    }

    @Override
    public String brake() {
        return this.getClass().getSimpleName() + " Holden is breaking";
    }

}