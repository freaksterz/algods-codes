package freakster.hack;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by freakster on 4/6/2015.
 * Problem

 You receive a credit C at a local store and would like to buy two items. You first walk through the store and create a list L of all available items. From this list you would like to buy two items that add up to the entire value of the credit. The solution you provide will consist of the two integers indicating the positions of the items in your list (smaller number first).

 Input

 The first line of input gives the number of cases, N. N test cases follow. For each test case there will be:

 One line containing the value C, the amount of credit you have at the store.
 One line containing the value I, the number of items in the store.
 One line containing a space separated list of I integers. Each integer P indicates the price of an item in the store.
 Each test case will have exactly one solution.
 Output

 For each test case, output one line containing "Case #x: " followed by the indices of the two items whose price adds up to the store credit. The lower index should be output first.

 Limits

 5 ? C ? 1000
 1 ? P ? 1000

 Small dataset

 N = 10
 3 ? I ? 100

 Large dataset

 N = 50
 3 ? I ? 2000

 Sample


 Input

 Output
 3
 100
 3
 5 75 25
 200
 7
 150 24 79 50 88 345 3
 8
 8
 2 1 9 4 4 56 90 3
 Case #1: 2 3
 Case #2: 1 4
 Case #3: 4 5

 */
public class StoreCredit {
    static BufferedWriter writer;
    static BufferedReader reader;
    static int caseNumber=1;

    public static void main(String[] args) throws IOException {
        int newLineChar = 13;
        int c;
        int p;

        File inFile = new File("input.txt"); // input file
        File outFile = new File("output.out"); // outfile
        FileWriter fwriter = new FileWriter(outFile);
        writer = new BufferedWriter(fwriter);
        FileReader freader = new FileReader(inFile);
        reader = new BufferedReader(freader);
        int numCases = Integer.parseInt(reader.readLine());

        for (int i = 0; i < numCases; i++) {

            c = Integer.parseInt(reader.readLine());
            p = Integer.parseInt(reader.readLine());
            int[] a = new int[p];
            for (int j = 0; j < p; j++) {
                a[j] = reader.read();
            }

            findnPrintPair(c, p, a);

        }
    }

    private static void findnPrintPair(int c, int p, int[] a) {
        Boolean[] boolMap = new Boolean[2000];
        Arrays.fill(boolMap, false);
        int temp;
        boolean flag = true;
        for (int i = 0; i < a.length; i++) {
            temp = c - a[i];
            //if(flag){
                System.out.print("Case #"+ caseNumber +":");
                flag = false;
            //}
            if(temp >=0 && boolMap[temp] == true){
                System.out.print(" "+i);

            }
            boolMap[a[i]] = true;
        }


    }


}


