3. 删除有序数组中的重复项1
https://leetcode.cn/problems/remove-duplicates-from-sorted-array/?envType=study-plan-v2&envId=top-interview-150
class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        for (int i = 1;i < nums.length;i++) {
            if (nums[index] != nums[i]) {
                nums[++index] = nums[i];
            } 
        }
        return index+1;
    }
}