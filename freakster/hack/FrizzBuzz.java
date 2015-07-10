package freakster.hack;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by aga2 on 7/10/2015.
 */
public class FrizzBuzz {


    public static void main(String args[] ) throws Exception {
        /*
         *Read input from stdin and provide input before running
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();



            String nextLine = br.readLine();
            String[] numbers = nextLine.split(" ");
            printSeries(numbers);


        br.close();
        }




    private static void printSeries(String[] numbers) {

        for (int  j = 0; j < numbers.length; j++) {
            int n = Integer.parseInt(numbers[j]);
            //n2 = Integer.parseInt(numbers[1]);

            for (int i = 1; i <= n; i++) {
                if (i > 5 && i % 3 == 0 && i % 5 == 0) {
                    System.out.print("FrizzBuzz");
                    System.out.println();
                } else if (i >= 5 && i % 5 == 0) {
                    System.out.print("Buzz");
                    System.out.println();
                } else if (i >= 3 && i % 3 == 0) {
                    System.out.print("Fizz");
                    System.out.println();
                } else {
                    System.out.print(i);
                    System.out.println();
                }
            }
        }

    }

}



