public class Mitsubishi extends Car {

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return this.getClass().getSimpleName() + " Mitsubishi is starting";
    }

    @Override
    public String accelerate() {
        return this.getClass().getSimpleName() + " Mit is accelerating";
    }

    @Override
    public String brake() {
        return this.getClass().getSimpleName() + " Mit is breaking";
    }
}


