package AdapterDesignPattern;

public class PrinterAdapter implements NewPrinter{

    OldPrinter oldPrinter=new OldPrinter();

    public PrinterAdapter(OldPrinter oldPrinter) {
        this.oldPrinter = oldPrinter;
    }

    @Override
    public void printNew() {
        oldPrinter.printOld();

    }

    public static void main(String[] args) {
        // Create an instance of the OldPrinter
        OldPrinter oldPrinter = new OldPrinter();

        // Create an instance of the PrinterAdapter, passing the OldPrinter instance to it
        PrinterAdapter printerAdapter = new PrinterAdapter(oldPrinter);

        // Call the printNew method on the PrinterAdapter
        printerAdapter.printNew();
    }

}
