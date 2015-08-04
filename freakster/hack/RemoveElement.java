package freakster.hack;

import java.util.Scanner;

/**
 * Given an array and a value, remove all instances of that value in place and return the new length.

 The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 * Created by freakster on 7/13/2015.
 */
public class RemoveElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums= {1,2,3,4,3,5,6,3};
        int val=3;
        System.out.println(removeElement(nums, val));
    }



    public static int removeElement(int[] nums, int val) {

        int i=0,j=0;

        while(i<nums.length)
        {
            if(nums[i] != val)
            {
                nums[j]=nums[i];
                j++;
            }
           i++;
        }



        return j;

    }


}
