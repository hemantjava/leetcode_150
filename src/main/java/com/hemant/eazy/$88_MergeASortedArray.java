package com.hemant.eazy;

import java.util.Arrays;

public class $88_MergeASortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));//[1, 2, 2, 3, 5, 6]

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; //last index
        int j = n - 1; //last index
        int k = m + n - 1;//last index

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}
