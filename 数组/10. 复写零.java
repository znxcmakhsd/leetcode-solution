10. 复写零
// https://leetcode.cn/problems/duplicate-zeros/
class Solution {
    public void duplicateZeros(int[] arr) {
        // 1. 找到最后一个复写数
        int dst = -1,cur = 0;
        while (true) {
            if (arr[cur] == 0) {
                dst += 2;
            }else {
                dst++;
            }
            if (dst >= arr.length-1) {
                break;
            }
            cur++;
        }
        // // 1.5 处理越界
        // [1,0,2,3,0,4]
        // 越界一定是遇到了0,
        if (dst == arr.length) {
            arr[dst-1] = 0;
            dst-=2;
            cur--;
        }

        // 2. 从后往前完成复写
        while (cur >= 0) {
            if(arr[cur] != 0) {
                arr[dst--] = arr[cur--];               
            }else {
                arr[dst] = 0;
                arr[dst-1] = 0;
                dst -= 2;
                cur--;
            }
        }
    }
}