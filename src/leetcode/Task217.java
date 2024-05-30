package leetcode;
// https://leetcode.com/problems/contains-duplicate/description/
public class Task217 {
    // 217. Contains Duplicate
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j])
                    return true;
            }
        }
        return false;
    }
}
