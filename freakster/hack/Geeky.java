package freakster.hack;

/**
 * Created by freakster on 1/2/15.
 */

import java.math.BigInteger;
import java.util.Scanner;

/**
 * One day Alice was experimenting with the numbers to make new algorithms. He introduce a new term Rsum. Rsum of any number is defined as number obtained by iterative summing of digits of the given number until single digit number is obtained.
 For example:
 365 --> (3+6+5) = 14
 14 --> 1+4 = 5
 Rsum(365)=5

 Naughty Bob came in the room of Alice in his absence and change all the numbers on which Alice was experimenting by their corresponding factorials. For example Bob will change 3 with 6 (3!=321). Consider 0!=0.

 When Alice start experimenting without knowing that the numbers are now changed. He got some ambiguous results and unable to find some pattern for his algorithm. So he wants your help. You are given a range [A,B] of actual numbers and your task is to find sum of all Rsum values in range [A,B] of new changed numbers.

 Input:
 First line consist of T test cases. Next T line contain two integers a,b in each line.

 Output:
 Find Sum of Rsum of all numbers in given range [A,B].

 Constraints:
 1<=T<=105
 0<=A<=B<=106
 Sample Input (Plaintext Link)

 2
 1 3
 3 4

 Sample Output (Plaintext Link)

 9
 12

 Explanation
 Test case 1:
 1!=1 and Rsum(1)=1,
 2!=2 and Rsum(2)=2,
 3!=6 and Rsum(6)=6.
 So the sum of Rsums is 1+2+6=9.

 */
public class Geeky {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long testCases = scanner.nextLong();
        for (int i = 0; i < testCases; i++) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            long rsum = calculateRSUM(a, b);
            System.out.println(rsum);
        }

    }

    private static long calculateRSUM(long a, long b) {
        long result = 0;
        for (long i = a; i <= b ; i++) {
            BigInteger factorial = getFactorial(i);
            int rsum = getRSUM(factorial);
            result += rsum;
        }

        return result;
    }
    private static int getRSUM(BigInteger b) {

        if ( b.intValue()<10){
            return b.intValue();
        }else{
            BigInteger temp = BigInteger.ZERO;
            int comp = b.compareTo(BigInteger.ZERO);
            while(comp == 1 ){
                temp = temp.add(b.remainder(BigInteger.TEN));
                b = b.divide(BigInteger.TEN);
                comp = b.compareTo(BigInteger.ZERO);
            }
            return getRSUM(temp);
        }

    }

    private static BigInteger getFactorial(long input) {
        if(input == 1) return BigInteger.ONE;
        return getFactorial(input - 1).multiply(new BigInteger(String.valueOf(input)));
    }
}
