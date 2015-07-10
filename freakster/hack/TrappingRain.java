package freakster.hack;

import java.util.Scanner;

/**
 * Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.
 *   For example,
 * Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.
 * Created by freakster on 7/3/2015.
 */
public class TrappingRain {

    public static int trap(int[] A) {

        if(A.length == 0)
        {
            return 0;
        }

        int[] maxLeft = new int[A.length];
        int[] maxRight = new int[A.length];

        int max = A[0];


        for (int i = 1; i < A.length - 1; i++)
        {
            maxLeft[i] = max;
            if (A[i] > max)
            {
                max = A[i];
            }
        }

        max = A[A.length-1];
        for (int j = A.length-2; j >= 0 ; j--)
        {
            maxRight[j] = max;
            if (A[j] > max)
            {
                max = A[j];
            }
        }

        int result =0;
        //int trap =0;
            for (int j = 1; j < A.length-1; j++  )
            {
                //maxRight[j] = max;
                    int trap = Math.min(maxLeft[j], maxRight[j]) - A[j];
                    if(trap > 0)
                    {
                        result += trap;
                    }

            }






        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(a));
    }
}
