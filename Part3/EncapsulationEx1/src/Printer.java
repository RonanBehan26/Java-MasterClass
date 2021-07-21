public class Printer {

    private int tonerLevel;
    private int numberOfPagesPrinted;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, int numberOfPagesPrinted) {
        this.tonerLevel = tonerLevel;
        this.numberOfPagesPrinted = numberOfPagesPrinted;
        this.duplexPrinter = duplexPrinter;
    }

    public void fillToner(int tonerLevel){

        if(tonerLevel < 0){
            System.out.println("No toner put in");
            System.out.println(this.tonerLevel);
        }else if(tonerLevel > 100){
            System.out.println("Toner Full");
            this.tonerLevel = 100;
            System.out.println(this.tonerLevel);
        }else{
            this.tonerLevel = this.tonerLevel + tonerLevel;
            System.out.println(this.tonerLevel);
        }

        if(this.tonerLevel < 0){
            this.tonerLevel = 0;
            System.out.println("Toner Empty");
        }else if(this.tonerLevel > 100){
            this.tonerLevel = 100;
            System.out.println("Toner Full");
        }


    }

    public void printPages(int numberOfPagesPrinted){
        if(this.duplexPrinter) {
            numberOfPagesPrinted = numberOfPagesPrinted / 2;
        }

            System.out.println("Printing in Duplex mode");
        this.numberOfPagesPrinted = this.numberOfPagesPrinted + numberOfPagesPrinted;
        System.out.println("Printing page " + this.numberOfPagesPrinted);
    }
}
