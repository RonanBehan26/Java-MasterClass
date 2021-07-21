public class Main {

    public static void main(String[] args) {
	//Ronan's
        Lights lights = new Lights();
        Furniture furniture = new Furniture(2, 5, 9);
        Heating heating = new Heating();

        Room r = new Room(lights, heating, furniture);

        r.heatOff();
        r.lightsOninRoom();
        r.furniture();

        //Tim's
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12, 55);
        Bed bed = new Bed("Modern", 4, 3, 2, 1);
        Lamp lamp = new Lamp("Classic", false, 75);
        Bedroom bedroom = new Bedroom("Tims", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedroom.makeBed();

        bedroom.getLamp().turnOn();
    }
}
