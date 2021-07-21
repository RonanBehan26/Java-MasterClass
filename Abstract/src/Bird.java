public abstract class Bird extends Animal implements CanFly{

    //so he wants to include a fly method
    //but not all birds can fly
    //makes this class abstract


    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breath out, repeat");
    }

    //but bats can fly so we will take this out and put in an interface
    //implement the interface instead
    //public abstract void fly();

    //implemented from the CanFly
    @Override
    public void fly() {
        System.out.println(getName() + " is flapping his wings");
    }
}
