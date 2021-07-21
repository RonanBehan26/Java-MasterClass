public class Main {

    public static void main(String[] args) {
	//Ronan's
		Printer p = new Printer(50, 23);

	p.fillToner(52);
	p.printPages(49);


	//Tim's
	TimsPrinter t = new TimsPrinter(23, true);
	System.out.println("initial page count = " + t.getPagesToPrint());
	int pagesPrinted = t.printPages(4);
	System.out.println("Pages printed was " + pagesPrinted + " new total print count: " + t.getPagesToPrint());
	pagesPrinted = t.printPages(2);
	System.out.println("Pages printed was " + pagesPrinted + " new total print count: " + t.getPagesToPrint());
    }
}
