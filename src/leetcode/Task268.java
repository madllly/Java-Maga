package leetcode;

// https://leetcode.com/problems/missing-number/description/

public class Task268 {
    // 268. Missing Number
    public int missingNumber(int[] nums) {
        int res = nums.length;
        
        for (int i = 0; i < nums.length; i++) {
            res += i - nums[i];
        }
        
        return res;       
    }
}
