package freakster.hack;
/**
 * Problem Statement

 Alex is attending a Halloween party with his girlfriend Silvia. At the party, Silvia spots a giant chocolate bar. If the chocolate can be served as only 1 x 1 sized pieces and Alex can cut the chocolate bar exactly K times, what is the maximum number of chocolate pieces Alex can cut and give Silvia?

 Input Format
 The first line contains an integer T, the number of test cases. T lines follow.
 Each line contains an integer K

 Output Format
 T lines. Each line contains an integer that denotes the maximum number of pieces that can be obtained for each test case.

 Constraints
 1<=T<=10
 2<=K<=107

 Note
 Chocolate must be served in size of 1 x 1 size pieces.
 Alex can't relocate any of the pieces, nor can he place any piece on top of another.

 Sample Input #00

 4
 5
 6
 7
 8
 Sample Output #00

 6
 9
 12
 16
 */

import java.util.Scanner;

/**
 * Created by AGA2 on 1/29/2015.
 */
public class HalloweenParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        for (int i = 0; i < testCases; i++) {
            long cuts = scanner.nextLong();
            System.out.println(getNumberofChoclates(cuts));
        }

    }

    private static long getNumberofChoclates(long cuts) {
        if(cuts==0)return 0;

        long verticallines = cuts/2;
        long horizontallines = cuts-verticallines;



        return verticallines*horizontallines;
    }


}
