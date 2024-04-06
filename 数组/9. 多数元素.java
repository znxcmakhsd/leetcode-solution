9. 多数元素
// https://leetcode.cn/problems/majority-element/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public int majorityElement(int[] nums) {
        int count = 1, tmp = nums[0];
        for (int i = 1;i < nums.length;i++) {
            if (nums[i] == tmp) {
                count++;
            }else {
                count--;
                if (0 == count) {
                    count = 1;
                    tmp = nums[i];
                }
            }
        }
        return tmp;
    }
}
