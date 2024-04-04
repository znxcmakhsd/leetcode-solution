// 5. 轮转数组 
https://leetcode.cn/problems/rotate-array/description/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length; 
        // [1,2,3,4,5,6,7] -> [7,6,5,4,3,2,1]
        swap(nums,0,nums.length-1);

        // [7,6,5,4,3,2,1] -> [5,6,7,4,3,2,1]
        swap(nums,0,k-1);

        // [5,6,7,4,3,2,1] -> [5,6,7,1,2,3,4]
        swap(nums,k,nums.length-1);
    }

    public void swap(int[] nums,int left,int right) {
        while (left < right) {
            int tmp = nums[left];
            nums[left] = nums[right];
            nums[right] = tmp;
            left++;
            right--;
        }
    }
}