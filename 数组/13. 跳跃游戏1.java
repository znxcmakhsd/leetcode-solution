13. 跳跃游戏
https://leetcode.cn/problems/jump-game/description/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public boolean canJump(int[] nums) {
        if (1 == nums.length) {
            return true;
        }
        int pos = nums.length-1;
        int i = pos-1;
        while (i >= 0) {
            // nums[i] + i, 表示可以到达的最大下标
            if (nums[i] + i >= pos) {
                pos = i;
            }
            if (0 == i) {
                return 0 == pos;
            }
            i--;
        }
        return false;
    }
}