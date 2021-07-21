public class Room {
    //Tim
    private Lights lights;
    private Heating heating;
    private Furniture furniture;

    public Room(Lights lights, Heating heating, Furniture furniture) {
        this.lights = lights;
        this.heating = heating;
        this.furniture = furniture;
    }

    public void lightsOninRoom(){
        lights.turnOnLights(2, true, true);
        ambiance();
    }

    public void furniture(){
        getFurniture().countFurniture(1, 3, 4);
    }

    public void heatOn(){
        getHeating().On(50);
    }

    public void heatOff(){
        getHeating().Off();
    }


    public void ambiance(){
        System.out.println("Let there be ambiance");
    }

    public Lights getLights() {
        return lights;
    }

    public Heating getHeating() {
        return heating;
    }

    public Furniture getFurniture() {
        return furniture;
    }

    public void lightsOn(){

    }
}
