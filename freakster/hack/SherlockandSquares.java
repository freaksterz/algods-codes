package freakster.hack;
/**
 * Problem Statement

 Watson gives two integers A & B to Sherlock and asks if he can count the number of square integers between A and B (both inclusive).

 A square integer is an integer which is the square of any integer. For example, 1, 4, 9, 16 are some of the square integers as they are squares of 1, 2, 3, 4 respectively.

 Input Format
 First line contains T, the number of testcases. T test cases follow, each in a newline.
 Each testcase contains two space separated integers denoting A and B.

 Output Format
 For each testcase, print the required answer in a new line.

 Constraints
 1 ≤ T ≤ 100
 1 ≤ A ≤ B ≤ 109

 Sample Input

 2
 3 9
 17 24
 Sample output

 2
 0
 */

import java.util.Scanner;

/**
 * Created by AGA2 on 1/28/2015.
 */
public class SherlockandSquares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        for (int i = 0; i < testCases ; i++) {
            long A = scanner.nextLong();
            long B = scanner.nextLong();
            getALLSquareRoot(A,B);
        }
    }

    private static void getALLSquareRoot(long a, long b) {

        long first = (long) Math.ceil(Math.sqrt(a));
        int count = 0;
        //long first =a;
        long temp = first*first;
        while(temp <= b){

            first++;
            temp = first*first;
            count++;
        }
        System.out.println( count );


    }

}
