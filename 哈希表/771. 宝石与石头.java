https://leetcode.cn/problems/jewels-and-stones/

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        for(int i = 0;i < jewels.length();i++) {
            char ch = jewels.charAt(i);
            set.add(ch);
        }

        for(int i = 0;i < stones.length();i++) {
            if (set.contains(stones.charAt(i))){
                count++;
            }
        }
        return count;
    }
}