package freakster.hack;

/**
 * Created by freakster on 7/16/2015.
 */
public class EvenOddPrinter {

    boolean isOdd = false;

    public synchronized void printEven (int even)
    {
        while(!this.isOdd){
            try{
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }

            System.out.println("even = " + even);
            this.isOdd =false;
            notify();
        }
    }

    public synchronized void printOdd (int odd)
    {
        while(this.isOdd){
            try{
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }

            System.out.println("odd = " + odd);
            this.isOdd =true;
            notify();
        }
    }
}
