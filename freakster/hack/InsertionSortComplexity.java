package freakster.hack;

import java.util.Scanner;

/**
 * Created by AGA2 on 1/30/2015.
 */
public class InsertionSortComplexity {

    public static int insertionSort(int[] A) {
        int count = 0;
        for (int i = 1; i < A.length; i++) {
            int value = A[i];
            int j = i - 1;
            while (j + 1 > 0 && A[j] > value) {
                A[j + 1] = A[j];
                count++;
                j = j - 1;
            }
            A[j + 1] = value;
//            /count++;
        }
    return count;
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //int testCases =  in.nextInt();
        //int testCases =  in.nextInt();

        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=in.nextInt();
        }
        System.out.println(insertionSort(ar));
    }


}
