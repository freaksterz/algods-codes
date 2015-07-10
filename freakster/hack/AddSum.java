package freakster.hack;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by aga2 on 7/10/2015.
 */
public class AddSum {



    public static void main(String args[] ) throws Exception {
        /*
         *Read input from stdin and provide input before running
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        int n1,n2;
        for (int i = 0; i < N; i++) {
            String nextLine = br.readLine();
            String[] numbers = nextLine.split(" ");
            //for (int j = 0; j < numbers.length; j++) {
            n1 = Integer.parseInt(numbers[0]);
            n2 = Integer.parseInt(numbers[1]);
            //}

            System.out.println(addSum(n1,n2));
        }



    }

    private static int addSum(int n1, int n2) {
        return n1+n2;
    }
}
