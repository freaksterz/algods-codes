package freakster.hack;

/**
 *

 Problem Statement

 Given two integers: L and R,

 find the maximal values of A xor B given, L ≤ A ≤ B ≤ R

 Input Format
 The input contains two lines, L is present in the first line.
 R in the second line.

 Constraints
 1 ≤ L ≤ R ≤ 103

 Output Format
 The maximal value as mentioned in the problem statement.

 Sample Input#00

 1
 10

 Sample Output#00

 15

 */


import java.util.Scanner;

/**
 * Created by freakster on 1/21/2015.
 */
public class MaximizeXOR {

        static int maxXor(int l, int r) {
        int max_xor =0;
        for (int i = l; i <= r; i++) {
            for (int j = l; j <=r; j++) {
                if ( (i^j) > 0 && (i^j) > max_xor){
                    max_xor = (i^j);
                }
            }


        }


        return max_xor;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        int _l;
        _l = Integer.parseInt(in.nextLine());

        int _r;
        _r = Integer.parseInt(in.nextLine());

        res = maxXor(_l, _r);
        System.out.println(res);

    }
}
