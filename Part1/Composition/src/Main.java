public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        //Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, nativeResolution);
        //could write: Resolution resolution = new Resolution(2540, 1440);
        //OR
        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));
        //you do this when you want to create a variable but you won't use it bar passing to a method (new Resolution)
        //You created an instance of a class without using a variable

        Motherboard theMotherBoard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");


        PC thePC = new PC(theCase, theMonitor, theMotherBoard);//3 params that make up the PC, pass to the constructor
        //WE PUT THESE IN INSTEAD< ONCE THE GETTERS WERE GONE
        thePC.powerUp();

        //THESE WERE REDUNDANT AFTER WE GOT RID OF THE GETTERS
        //so we want to get at the drawPixelAt, which is in monitor, we want to access it from PC
        //thePC.getMonitor().drawPixelAt(1500, 1200, "red");

        //you see, call the monitor from the PC and then invoke the method from there
        //thePC.getMotherboard().loadProgram("Windows 1.0");
        //thePC.getTheCase().pressPowerButton();
        //COMPOSITION rather than inhertance

    }
}
