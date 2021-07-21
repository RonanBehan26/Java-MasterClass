public class Main {

    public static void main(String[] args) {
        //Ronan's Work

	Vehicle vehicle = new Vehicle("V8", 4, "Varroc", 4,3541);

        Car car = new Car("V12", 4, 3000, 1, 4, 1, true);

        Bugatti b = new Bugatti("V12", 4, 4000, 1, 4, 1, false, 250, "Messi", "Barcalona");

        car.move(60);
        b.moveBugatti(250);

        //Tim's Example
        Outlander outlander = new Outlander(36);
        outlander.steer(45);
        outlander.accelerate(30);
        outlander.accelerate(20);
        outlander.accelerate(-42);
    }
}
