package freakster.hack;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by AGA2 on 2/19/2015.
 */
public class NextGreaterNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n!=0){
            count++;

        }
        int i=0;
        do {
            //arr[i] = n % 10;
            n /= 10;
            i++;
        } while (n != 0);
        int[] arr = new int[i+1];

        int[] ngn = findNext(arr);
        System.out.println("ngn = " + ngn);
        for (int z = 0; z < ngn.length; z++) {
            System.out.println( ngn[z] + " ");

        }
    }

    private static int[] findNext(int[] arr) {
        //int ngn;
        int i, j;
        for ( i = arr.length-1; i >0 ; i--) {
            if(arr[i] < arr[i-1]){
                break;
            }
        }
        int smallest = i-1;

        for (j=i-1; j < arr.length; j++){
            if(arr[j] < smallest ){
            smallest =j;
            }
        }
        int temp = arr[i-1];
        arr[i-1] = arr[smallest];
        arr[smallest] = temp;


        Arrays.sort(arr,i,arr.length-1);


        
        
        
        
        return arr;
    }
}
