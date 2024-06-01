package timus;

import java.util.Arrays;

// https://leetcode.com/problems/merge-sorted-array/description/
public class task_16 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};

        merge(nums, 3, nums2, 3);

        System.out.println(Arrays.toString(nums));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int pMerge = m + n - 1;

        while (p2 >= 0) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[pMerge--] = nums1[p1--];
            } else {
                nums1[pMerge--] = nums2[p2--];
            }
        }
    }
}
