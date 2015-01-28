package freakster.hack;

/**
 * Problem Statement

 Little Bob loves chocolates, and goes to a store with $N in his pocket. The price of each chocolate is $C. The store offers a discount: for every M wrappers he gives to the store, he gets one chocolate for free. How many chocolates does Bob get to eat?

 Input Format:
 The first line contains the number of test cases T(<=1000).
 T lines follow, each of which contains three integers N, C and M

 Output Format:
 Print the total number of chocolates Bob eats.

 Constraints:
 2≤N≤105
 1≤C≤N
 2≤M≤N

 Sample input

 3
 10 2 5
 12 4 4
 6 2 2

 Sample Output

 6
 3
 5

 */

import java.util.Scanner;

/**
 * Created by AGA2 on 1/28/2015.
 */
public class ChocolateFeast {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            System.out.println(Solve(in.nextInt(), in.nextInt(), in.nextInt()));
        }
    }

    /**
     * @param N
     * @param C
     * @param M
     * @return
     */
    private static long Solve(int N, int C, int M) {
        long no_of_choc = 0;
        //Write code to solve each of the test over here
        if (C !=  0) {
            no_of_choc = N / C;
        }

        long wrappers = no_of_choc;
        while ((wrappers >= M) && (M != 0)) {
            //wrappers = no_of_choc;
            no_of_choc = no_of_choc + wrappers / M;
            wrappers = (wrappers % M) + (wrappers / M);

        }

        return no_of_choc;

    }
}