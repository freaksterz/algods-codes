package freakster.hack;

import java.util.Scanner;

/**
 * Created by AGA2 on 3/30/2015.
 */
public class TrailingZeros {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count =0;
        int d=1,r=1;

        while(r>0){
            d*=5;
            r = n/d;
            count += r;

        }
        System.out.println("count = " + count);
    }

}
