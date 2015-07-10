package freakster.hack;

import java.util.Scanner;

/**
 * Created by freakster on 7/3/2015.
 */
public class CountBit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(hammingWeight(n));
    }

    public static int hammingWeight(int n) {
        int count = 0;
        boolean flag = true;

        while (n!=0)
        {
         n = n & (n-1);
         count++;
        }



        return count;
    }
}
