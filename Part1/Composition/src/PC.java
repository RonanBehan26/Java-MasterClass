public class PC {

    //so if we just used basic inheritance (extends) we can only do one class at a time.
    //this is composition
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }
    //2. But we are creating this to access the get methods
    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }

    public void drawLogo(){
        //way 1, accessing the getter, but this is a more complicated code
        //getMonitor().drawPixelAt(1200, 50, "yellow");

        //way 2, directly accessing, by accessing for the variable, this is better
        monitor.drawPixelAt(1200, 50, "yellow");

        //the variables above in which you can access the class objects mean that the getters are redundant
        //so now we will do away with the getters
    }
        //you might leave the getters if you wanted to do some verification

//
//    //1. so we are making these private so they can't be accessed by the main class
//    private Case getTheCase() {
//        return theCase;
//    }
//
//    private Monitor getMonitor() {
//        return monitor;
//    }
//
//    private Motherboard getMotherboard() {
//        return motherboard;
//    }
}
