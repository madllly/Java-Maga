package timus;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
public class task_6 {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1, 2, 3, 3}));
    }

    static public int removeDuplicates(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==nums[j]){
                continue;
            }
            j++;
            nums[j]=nums[i];
        }
        return ++j;
    }

}
