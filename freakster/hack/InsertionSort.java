package freakster.hack;

import java.util.Scanner;

/**
 * Created by AGA2 on 1/29/2015.
 */
public class InsertionSort {


    public static void insertIntoSorted(int[] ar) {
        int length =  ar.length;
        //for (int i = 0; i < length; i++) {
        int i=0;
        if(length == 1){
            printArray(ar);
            return;
        }
        int temp = ar[length-i-1];

            while( temp < ar[length-i-2]){

                ar[length-i-1] = ar[length-i-2];
                printArray(ar);
                if(i<length-2) {
                    i++;
                }else{
                    i++;
                    break;
                }
            }
        ar[length-i-1]=temp;
        printArray(ar);

    }


    /* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
        }
        insertIntoSorted(ar);
    }


    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}
