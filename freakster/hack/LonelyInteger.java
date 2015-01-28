package freakster.hack;
/**
 * Problem Statement

 There are N integers in an array A. All but one integer occur in pairs. Your task is to find out the number that occurs only once.

 Input Format

 The first line of the input contains an integer N indicating number of integers.
 The next line contains N space separated integers that form the array A.

 Constraints

 1 <= N < 100
 N % 2 = 1 ( N is an odd number )
 0 <= A[i] <= 100, ∀ i ∈ [1, N]

 Output Format

 Output S, the number that occurs only once.

 Sample Input:1

 1
 1
 Sample Output:1

 1
 Sample Input:2

 3
 1 1 2
 Sample Output:2

 2
 Sample Input:3

 5
 0 0 1 2 1
 Sample Output:3

 2
 */

import java.util.Scanner;

/**
 * Created by AGA2 on 1/28/2015.
 */
public class LonelyInteger {

    static int lonelyinteger(int[] a) {
        int res =0;
        int [] temp = new int[100];
        for (int i = 0; i < a.length; i++) {
            temp[a[i]]++;
        }
        for (int i = 0; i <temp.length ; i++) {
            if(temp[i] == 1){
                res = i;
            }

        }


        return res;

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;

        int _a_size = Integer.parseInt(in.nextLine());
        int[] _a = new int[_a_size];
        int _a_item;
        String next = in.nextLine();
        String[] next_split = next.split(" ");

        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(next_split[_a_i]);
            _a[_a_i] = _a_item;
        }

        res = lonelyinteger(_a);
        System.out.println(res);

    }
}
