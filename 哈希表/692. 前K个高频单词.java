import java.util.*;

class cmp implements Comparator<Map.Entry<String,Integer>> {
    @Override
    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
        // val 相同, 建大根堆
        if (o1.getValue().compareTo(o2.getValue()) == 0) {
            // ?
            return o2.getKey().compareTo(o1.getKey());
        }
        return o1.getValue().compareTo(o2.getValue());
    }
}

class Solution {
    public List<String> topKFrequent(String[] words, int k) {

        // 1.
        Map<String,Integer> map = new HashMap<>();
        for (String str : words) {
            if (map.get(str) == null) {
                map.put(str,1);
            }else {
                int val = map.get(str);
                map.put(str,val+1);
            }
        }

        // 2.
        PriorityQueue<Map.Entry<String,Integer>> minHeap = new PriorityQueue<>(new cmp());
        for (Map.Entry<String,Integer> entry: map.entrySet() ) {
            if (minHeap.size() < k) {
                // 小于k, 直接入堆
                minHeap.offer(entry);
            }else {
                Map.Entry<String,Integer> top = minHeap.peek();
                // entry > top
                if (entry.getValue().compareTo(top.getValue()) > 0) {
                    minHeap.poll();
                    minHeap.offer(entry);
                }
                // entry == top, 字典序小的入堆
                if (entry.getValue().compareTo(top.getValue()) == 0) {
                    if (entry.getKey().compareTo(top.getKey()) < 0) {
                        minHeap.poll();
                        minHeap.offer(entry);
                    }
                }
            }
        }

        List<String> list = new ArrayList<>();
        for (int i = 0;i < k;i++) {
            list.add(minHeap.poll().getKey());
        }
        Collections.reverse(list);
        return list;
    }
}