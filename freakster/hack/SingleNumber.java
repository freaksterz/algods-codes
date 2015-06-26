package freakster.hack;

import java.util.HashSet;

/**
 * Created by AGA2 on 4/29/2015.
 * Given an array of integers, every element appears twice except for one. Find that single one.
 * Note:Your algorithm should have a linear runtime complexity.
 * Could you implement it without using extra memory?
 *
 *
 */
public class SingleNumber {

    public static void main(String[] args)
    {
        int a[]= {2,3,4,2,3,4,5};

        System.out.println(singleNumber(a));
    }

    static int singleNumber(int[] nums)
    {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        int totalSum = 0;
        for(Integer n: nums)
        {
            hashSet.add(n);
            totalSum += n;
        }

        int sum = 0;

        for(Integer s : hashSet)
        {
         sum += s*2;
        }

        return sum-totalSum;

    }


}
