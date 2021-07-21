public class Ford extends Car {

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return this.getClass().getSimpleName() + " Ford is starting";
    }

    @Override
    public String accelerate() {
        return this.getClass().getSimpleName() + " Ford is accelerating";
    }

    @Override
    public String brake() {
        return this.getClass().getSimpleName() + " Ford is breaking";
    }
}
