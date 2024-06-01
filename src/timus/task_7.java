package timus;

// https://leetcode.com/problems/remove-element/
public class task_7 {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{1, 2, 3}, 2));
    }

    public static int removeElement(int[] nums, int val) {
        int j=nums.length-1;
        int count=0;
        for(int i=0;i<=j;i++)
        {
            if(nums[i]==val){
                count++;
                while(nums[j]==val&& j>i){
                    j--;
                    count++;
                }
                nums[i]=nums[j];
                nums[j]=val;
                j--;
            }
        }
        return nums.length-count;
    }
}
