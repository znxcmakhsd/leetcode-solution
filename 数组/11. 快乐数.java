11. 快乐数

https://leetcode.cn/problems/happy-number/

https://gitee.com/wu-xiaozhe/Algorithm/blob/master/01.%20%E4%BC%98%E9%80%89%E7%AE%97%E6%B3%95%E7%B2%BE%E5%93%81%E8%AF%BE_%E9%A2%98%E7%9B%AE%E5%88%97%E8%A1%A8+%E6%9D%BF%E4%B9%A6+%E8%AF%BE%E4%BB%B6/%E4%BC%98%E9%80%89%E7%AE%97%E6%B3%95%E7%B2%BE%E5%93%81%E8%AF%BE_%E6%9D%BF%E4%B9%A6/003_%E5%BF%AB%E4%B9%90%E6%95%B0.jpg


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