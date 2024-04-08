12. 盛最多水的容器

https://leetcode.cn/problems/container-with-most-water/

class Solution {
    public int maxArea(int[] height) {
        // 利用 单调性 想出的解法
        int max = 0,l = 0,r = height.length-1;
        while (l < r) {
            int minHeigh = Math.min(height[l],height[r]);
            max = Math.max(max,minHeigh*(r-l));
            if (height[l] < height[r]) {
                l++;
            }else {
                r--;
            }
        }
        return max;
    }
}