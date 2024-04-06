https://leetcode.cn/problems/happy-number/
11. 快乐数
class Solution {
    public int bitSum(int n) {
        int sum = 0;
        while(n != 0) {
            int t = n % 10;
            sum += t * t;
            n /= 10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        // 重点: 一定会成环
        // 所以可以用快慢指针
        int slow = n,fast = bitSum(n);
        while (slow != fast) {
            slow = bitSum(slow);
            fast = bitSum(bitSum(fast));
        }
        return slow == 1;
    }
}