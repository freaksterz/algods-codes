package freakster.hack;

/**
 * Created by AGA2 on 7/16/2015.
 */
public class PrintTask implements Runnable {
    int max = 0;boolean isEven = false;
    EvenOddPrinter p = null;
    int num =0;


    public PrintTask(EvenOddPrinter printer, int i, boolean b) {
        this.p =  printer;
        this.max = i;
        this.isEven = b;
    }


    public void run () {
        num = (isEven) ? 2:1;

        while(num <= max)
        {
            if(isEven){
                p.printEven(num);
            }
            else {
                p.printOdd(num);
            }
            num =+2;
        }
    }





}
