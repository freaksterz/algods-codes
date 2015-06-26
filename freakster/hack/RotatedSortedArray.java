package freakster.hack;

import java.util.Scanner;

/**
 *
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand.

 (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

 You are given a target value to search. If found in the array return its index, otherwise return -1.

 You may assume no duplicate exists in the array.
 * Created by AGA2 on 6/22/2015.
 */
public class RotatedSortedArray {

    public static void main(String[] args)
    {
        int[] a = {3,1};
        int target = 0;

        System.out.println(search(a, target));

    }

    public static int search(int[] nums, int target)
    {
        int pivot = findPivot (nums, 0, nums.length-1);

        if (pivot ==-1)
            return -1;

        if(nums[pivot] == target)
        {
            return pivot;
        }

        if( nums[0] <= target)
        {
            return  binarySearch(nums, 0, pivot-1 ,target);
        }
        else
        {
            return binarySearch(nums, pivot+1, nums.length-1, target);
        }

    }

    public static int binarySearch(int[] a,int low, int high, int target)
    {
        if( high < low)
        {
            return -1;
        }

        int mid = (low + high)/2;

        if(target == a[mid])
        {
            return mid;
        }

        if(a[mid] < target)
        {
            return binarySearch(a, mid+1, high, target);
        }
        else
        {
            return binarySearch(a, low, mid-1, target);
        }

    }

    public static int findPivot(int[] nums, int low, int high)
    {

        if( high < low)
        {
         return -1;
        }

        if(high == low)
        {
         return low;
        }

        int mid;

        if( high%2 !=0)
        {
            mid = (low + high)/2 ;
        }
        else
        {
            mid = (low +high)/2 -1;
        }


            if( mid < high && nums[mid] > nums[mid+1] && nums [mid] >nums[mid-1] )
        {
            return mid;
        }
        if( mid < low && nums[mid] < nums [mid-1] && nums[mid] < nums[mid+1]  )
        {
            return mid-1;
        }

        if( nums[low] > nums [mid] )
        {
            return findPivot(nums, low, mid-1);
        }
        else
        {
            return findPivot(nums, mid+1, high);
        }

    }
}
