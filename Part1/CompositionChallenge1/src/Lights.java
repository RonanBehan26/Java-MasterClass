public class Lights {
    //Tim
    private int numberOfLights;
    private boolean lightSwitchOn;
    private boolean lampOn;

    public void turnOnLights(int numberOfLights, boolean lightSwitchOn, boolean lampOn){
        System.out.println("Turning on " + numberOfLights + " lights. Are the lights on? " + lightSwitchOn + " Is the lamp on? "  + lampOn);
    }
}
