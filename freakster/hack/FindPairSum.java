package freakster.hack;

import java.util.Scanner;

/**
 * Created by AGA2 on 6/1/2015.
 */
public class FindPairSum {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int element =  sc.nextInt();
        int array [] = {2,5,6,8,9,1,3,10};

        getPair2(array, element);
    }


    /**
     * Find the pair in an array whose sum with complexity O(n). This assumes
     * the array passed is sorted array and there are no duplicates in the array
     *
     * @param arr
     *            input array of elements
     * @param k
     *            sum for which pair of array elements needs to be searched
     */
    public static void getPair2(int[] arr, int k) {
        int start = 0;
        int end = arr.length - 1;
        int sum = 0;

        // output array to record matching pairs
        StringBuilder arrs = new StringBuilder();

        while (start < end) {
            sum = arr[start] + arr[end];
            if (sum == k) {
                // we have found one pair, add it to our output array
                arrs.append(arr[start] + "," + arr[end] + ";");
                start++;
                end--;
            } else if (sum < k) {
                // if the sum of the pair is less than the sum we are searching
                // then increment the start pointer which would give us the sum
                // more than our current sum as the array is sorted
                start++;
            } else {
                // if the sum of the pair is greater than the sum we are searching
                // then decrement the end pointer which would give us the sum
                // less than our current sum as the array is sorted
                end--;
            }
        }
        System.out.println(arrs.toString());
    }

}
