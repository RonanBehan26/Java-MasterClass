public class Main {

    public static void main(String[] args) {
        Car car = new Car(8, "Prius");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi m = new Mitsubishi(4, "Tori");
        System.out.println(m.startEngine());
        System.out.println(m.accelerate());
        System.out.println(m.brake());

        Ford f = new Ford(2, "Henry");
        System.out.println(f.startEngine());
        System.out.println(f.accelerate());
        System.out.println(f.brake());

        Holden h = new Holden(10, "Bounce");
        System.out.println(h.startEngine());
        System.out.println(h.accelerate());
        System.out.println(h.brake());
    }
}
