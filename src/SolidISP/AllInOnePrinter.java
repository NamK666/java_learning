package SolidISP;

public class AllInOnePrinter implements Printer, Scanner, Fax{
    @Override
    public void fax() {
    System.out.println("fax발송하기");
    }

    @Override
    public void print() {
    System.out.println("print하기");
    }

    @Override
    public void scan() {
    System.out.println("scan하기");
    }
}
