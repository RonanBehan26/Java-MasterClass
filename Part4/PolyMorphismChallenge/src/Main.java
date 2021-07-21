class Car{

    public String name;
    public boolean engine;
    public int cylinder;
    public int wheels;

    public Car(String name, int cylinder) {
        this.name = name;
        this.cylinder = cylinder;
        this.wheels = 4;
        this.engine = true;
    }

    public String startEngine(){
        return "Starting Engine";
    }

    public String accelerate(){
        return "Accelerating";
    }

    public String brake(){
        return "Breaking";
    }

    public String getName() {
        return name;
    }

    public int getCylinder() {
        return cylinder;
    }
}

//next the 3 sub classes

class MercedesBenz extends Car{

    public MercedesBenz(String name, int cylinder){
        super(name, cylinder);
    }

    @Override
    public String startEngine() {
        return "Starting MB Engine";
    }

    @Override
    public String accelerate() {
        return "Accelerate MB";
    }

    @Override
    public String brake() {
        return "Break MB";
    }
}

class BMW extends Car{
    public BMW(String name, int cylinder){
        super(name, cylinder);
    }

    @Override
    public String startEngine() {
        return "Starting BMW Engine";
    }

    @Override
    public String accelerate() {
        return "Accelerate BMW";
    }

    @Override
    public String brake() {
        return "Break BMW";
    }

}

class Lada extends Car{
    public Lada(String name, int cylinder){
        super(name, cylinder);
    }

    @Override
    public String startEngine() {
        return "Starting Lada Engine";
    }

    @Override
    public String accelerate() {
        return "Accelerate Lada";
    }

}

//we refactored and copied the Lada to make this class, then added the final method
//then refactored, chose the make inner class of Main, to bring it back
class Ford extends Car{
    public Ford(String name, int cylinder){
        super(name, cylinder);
    }

    //Just another way, looking at the class, getSimple name located the class name
    //will say ford and then the message
    @Override
    public String startEngine() {
        return getClass().getSimpleName() + "Starting Main.Ford Engine";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() +  "Accelerate Main.Ford";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() +  "Break Main.Ford";
    }

}


public class Main {

    public static void main(String[] args) {

        Car car = new Car("Base Car", 8);
        System.out.println(car.startEngine());
        System.out.println(car.brake());
        System.out.println(car.accelerate());

        MercedesBenz merc = new MercedesBenz("Y", 4);
        System.out.println(merc.startEngine());
        System.out.println(merc.brake());
        System.out.println(merc.accelerate());

        Lada lada = new Lada("Vasili", 1);
        System.out.println(lada.startEngine());
        System.out.println(lada.brake());
        System.out.println(lada.accelerate());

        Ford ford = new Ford("Henry", 1);
        System.out.println(ford.startEngine());
        System.out.println(ford.brake());
        System.out.println(ford.accelerate());

    }


}

