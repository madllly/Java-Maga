package leetcode;

import java.util.Arrays;
// +
// https://leetcode.com/problems/majority-element/description/
public class Task169 {
    
    // 169. Majority Element
    static public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n / 2];
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 5, 6};
        System.out.println("Majority element: " + majorityElement(nums));
    }

}
