package leetcode;

class TwoSum {
    // https://leetcode.com/problems/two-sum/
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; ++i) {
            for (int j = i+1; j < nums.length; ++j) {
                boolean isEquals = (nums[i] == nums[j]);
                if (isEquals) return new int[] {i, j};
            }
        }
        return new int[] {};
    }
}