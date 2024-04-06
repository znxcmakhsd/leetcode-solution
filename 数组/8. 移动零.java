8. 移动零
https://leetcode.cn/problems/move-zeroes/description/

class Solution {
    public void moveZeroes(int[] nums) {
        for (int cur = 0,dst = -1;cur < nums.length;cur++) {
            if (nums[cur] != 0) {
                dst++;
                int tmp = nums[cur];
                nums[cur] = nums[dst];
                nums[dst] = tmp;
            }
        }
    }
}