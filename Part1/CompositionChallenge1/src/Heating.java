public class Heating {

    public boolean heatingIsOn;
    public boolean isHeatingIsOff;
    public int heat;

    public void On(int heat){
        isHeatingIsOn();
        System.out.println("Heating is on " + heat);
    }

    public void Off(){
        isHeatingIsOff();
        heat = 10;
        System.out.println("Heating is off " + heat);
    }

    //these are private and so are only accessible above
    private boolean isHeatingIsOn() {
        return heatingIsOn = true;
    }

    private boolean isHeatingIsOff() {
        return isHeatingIsOff = true;
    }

    private int getHeat() {
        return heat;
    }
}
