package freakster.hack;

/**
 *  The Utopian tree goes through 2 cycles of growth every year. The first growth cycle occurs during the spring, when it doubles in height. The second growth cycle occurs during the summer, when its height increases by 1 meter.
 Now, a new Utopian tree sapling is planted at the onset of the spring. Its height is 1 meter. Can you find the height of the tree after N growth cycles?

 Input Format
 The first line contains an integer, T, the number of test cases.
 T lines follow. Each line contains an integer, N, that denotes the number of cycles for that test case.

 Constraints
 1 <= T <= 10
 0 <= N <= 60

 Output Format
 For each test case, print the height of the Utopian tree after N cycles.

 Sample Input #00:

 2
 0
 1

 Sample Output #00:

 1
 2

 */



/**
 * Created by freakster on 1/21/2015.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class UtopianTree {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();

        for (int i = 0; i < testCases; i++) {
            int age = sc.nextInt();
            System.out.println(calculateUtopianTreeAge(age));
        }
    }

    private static int calculateUtopianTreeAge(int age) {
        int init_age = 1;
        for (int i = 1; i <= age; i++) {
            if( i%2 == 0){

                init_age = init_age+1;
            }else{
                init_age = init_age*2;
            }

        }
        return init_age;

    }
}