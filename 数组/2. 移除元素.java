// 2. 移除元素
https://leetcode.cn/problems/remove-element/?envType=study-plan-v2&envId=top-interview-150
class Solution {
    public int removeElement(int[] nums, int val) {
        int c = 0;
        for (int i = 0;i < nums.length;i++) {
            if (nums[i] == val) {
                c++;
            }else {
                nums[i-c] = nums[i]; 
            }
        }
        return nums.length - c;
    }

}