public class Penguin extends Bird{

    public Penguin(String name){
        super(name);
    }

    //we want to leave this overridden as we will impliment some functionality
    @Override
    public void fly() {
        super.fly();
        System.out.println("I can't fly well.");
    }
}
