package freakster.hack;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
author: freakster
*/

public class IsFibo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();


        for( int i=0; i<testCases; i++) {
            BigInteger number = sc.nextBigInteger();

            boolean isFib = isFib(number);
            if (isFib == true) {
                System.out.println("IsFibo");
            } else {
                System.out.println("IsNotFibo");
            }

        }
        }

    private static boolean isFib(BigInteger n) {

        BigInteger five = new BigInteger("5");
        BigInteger fiveSquare = five.multiply(n);
        fiveSquare = fiveSquare.multiply(n);
        BigInteger four = new BigInteger("4");

        return isPerfectSquare(fiveSquare.add(four)) ||isPerfectSquare(fiveSquare.subtract(four));

    }

    private static boolean isPerfectSquare(BigInteger l) {

        BigInteger s = (BigInteger) bigIntSqRootFloor(l);
        return( s.multiply(s).equals(l));
    }
    ///
    public static BigInteger bigIntSqRootFloor(BigInteger x)
            throws IllegalArgumentException {
        if (x.compareTo(BigInteger.ZERO) < 0) {
            throw new IllegalArgumentException("Negative argument.");
        }
        // square roots of 0 and 1 are trivial and
        // y == 0 will cause a divide-by-zero exception
        if (x == BigInteger.ZERO || x == BigInteger.ONE) {
            return x;
        } // end if
        BigInteger two = BigInteger.valueOf(2L);
        BigInteger y;
        // starting with y = x / 2 avoids magnitude issues with x squared
        for (y = x.divide(two);
             y.compareTo(x.divide(y)) > 0;
             y = ((x.divide(y)).add(y)).divide(two));
        return y;
    } // end bigIntSqRootFloor

    public static BigInteger bigIntSqRootCeil(BigInteger x)
            throws IllegalArgumentException {
        if (x.compareTo(BigInteger.ZERO) < 0) {
            throw new IllegalArgumentException("Negative argument.");
        }
        // square roots of 0 and 1 are trivial and
        // y == 0 will cause a divide-by-zero exception
        if (x == BigInteger.ZERO || x == BigInteger.ONE) {
            return x;
        } // end if
        BigInteger two = BigInteger.valueOf(2L);
        BigInteger y;
        // starting with y = x / 2 avoids magnitude issues with x squared
        for (y = x.divide(two);
             y.compareTo(x.divide(y)) > 0;
             y = ((x.divide(y)).add(y)).divide(two));
        if (x.compareTo(y.multiply(y)) == 0) {
            return y;
        } else {
            return y.add(BigInteger.ONE);
        }
    } // end bigIntSqRootCeil

}
