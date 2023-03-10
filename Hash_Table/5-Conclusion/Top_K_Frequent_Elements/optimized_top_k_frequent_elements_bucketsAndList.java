class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map <Integer, Integer> freqTable = new HashMap<>();

        for (Integer num : nums) {
            freqTable.put(num, freqTable.getOrDefault(num, 0) +1);
        }
        
        List<Integer>[] buckets = new List[nums.length + 1];
        for (int i = 0; i < buckets.length; i ++) {
            buckets[i] = new ArrayList<>();
        }
        for (int key : freqTable.keySet()) {
            buckets[freqTable.get(key)].add(key);
        }
        
        List<Integer> flattened = new ArrayList<>();
        for (int i = buckets.length - 1; i >= 0; i--) {
            for (int num : buckets[i]) {
                flattened.add(num);
            }
        }
        
        int[] top = new int[k];
        for (int i = 0; i < k; i++) {
            top[i] = flattened.get(i);
        }    
        return top;
    }
}