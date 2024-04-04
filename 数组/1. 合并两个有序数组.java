1. 合并两个有序数组
https://leetcode.cn/problems/merge-sorted-array/?envType=study-plan-v2&envId=top-interview-150
https://leetcode.com/problems/merge-sorted-array/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = nums1.length-1;i >= 0;i--) {
            int n1 = m == 0 ? Integer.MIN_VALUE : nums1[m-1];
            int n2 = n == 0 ? Integer.MIN_VALUE : nums2[n-1];
            
            if (n1 > n2) {
                nums1[i] = n1;
                m--;
            }else {
                nums1[i] = n2;
                n--;
            }

        }
    }
}