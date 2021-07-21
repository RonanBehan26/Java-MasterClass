public class TimsPrinter {

    //Tim's example
    private int tonerLevel;
    private int pagesToPrint;
    private boolean duplex;

    public TimsPrinter(int tonerLevel, boolean duplex) {
        if(tonerLevel >-1 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        }
        else {
            this.tonerLevel = -1;
        }

        this.pagesToPrint = 0;
        this.duplex = duplex;
    }

    public int addToner(int tonerLevel){
        if(tonerLevel > 0 && tonerLevel <= 100){
            if(this.tonerLevel + tonerLevel > 100){
                return -1;
            }
            this.tonerLevel = this.tonerLevel + tonerLevel;
            return this.tonerLevel;
        }else{
            return -1;
        }
    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        if(this.duplex){
            pagesToPrint = (pagesToPrint/2) + (pagesToPrint%2);
            System.out.println("Printing in Duplex mode");
        }
        this.pagesToPrint = this.pagesToPrint + pagesToPrint
                return pagesToPrint;
    }

    public int getPagesToPrint() {
        return pagesToPrint;
    }
}
