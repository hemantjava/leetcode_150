package com.hemant.eazy;

import java.util.Arrays;

/**
 * Example 1:

 * Input: nums = [1,1,2]
 * Output: 2, nums = [1,2,_]
 * Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 * Example 2:

 * Input: nums = [0,0,1,1,1,2,2,3,3,4]
 * Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
 * Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 */
public class $26_RemoveDuplicateSortedArray {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(Arrays.toString(nums));//[0, 0, 1, 1, 1, 2, 2, 3, 3, 4]
        System.out.println(removeDuplicates(nums));//5
        System.out.println(Arrays.toString(nums));//[0, 1, 2, 3, 4, 2, 2, 3, 3, 4] -> from start 5 elements are sorted
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int k = 1; // Pointer for the position of unique elements
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) { // Check if the current number is different
                nums[k] = nums[i];// Move the unique element to the position k
                k++;
            }
        }
        return k;
    }
}
