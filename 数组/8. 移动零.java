8. 移动零
https://leetcode.cn/problems/move-zeroes/description/
class Solution {
    public void moveZeroes(int[] nums) {
        int dst = 0, cur = 0;
        while (cur < nums.length) {
            if (nums[cur] == 0) {
                cur++;
            }else {
                int tmp = nums[cur];
                nums[cur] = nums[dst];
                nums[dst] = tmp;
                dst++;
                cur++;
            }
        }
    }
}