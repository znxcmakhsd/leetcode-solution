4. 删除有序数组中的重复项2
https://leetcode.cn/problems/remove-duplicates-from-sorted-array-ii/description/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 0;i < nums.length;i++) {
            if (j < 2 || nums[j-2] != nums[i]) {
                nums[j++] = nums[i]; 
            }
        }
        return j;
    }
}