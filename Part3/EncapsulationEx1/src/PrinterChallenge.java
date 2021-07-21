public class PrinterChallenge {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public PrinterChallenge(int tonerLevel, boolean duplex) {
        if(tonerLevel < 0 || tonerLevel > 100) {
            return -1;
        }else{
            this.tonerLevel = tonerLevel;
        }
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }


}
