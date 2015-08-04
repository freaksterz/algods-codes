package freakster.hack;

/**
 * Created by freakster on 7/16/2015.
 */
public class EvenOddTest {

    public static void main(String[] args) {
        EvenOddPrinter printer = new EvenOddPrinter();
        Thread t1even = new Thread(new PrintTask( printer , 10, true));
        Thread t2odd = new Thread(new PrintTask(printer, 10 , false));
        t1even.start();
        t2odd.start();
    }
}
