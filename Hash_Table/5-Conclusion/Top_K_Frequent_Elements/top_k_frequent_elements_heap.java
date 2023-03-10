class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if (k == nums.length) return nums;

        Map <Integer, Integer> freqTable = new HashMap<>();

        for (Integer num : nums) {
            freqTable.put(num, freqTable.getOrDefault(num, 0) +1);
        }
        
        Queue<Integer> heap = new PriorityQueue<>(
        (n1, n2) -> freqTable.get(n1) - freqTable.get(n2));
        
        for (int n : freqTable.keySet()) {
            heap.add(n);
            if(heap.size() > k) heap.poll();
        }
        
        int[] top = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            top[i] = heap.poll();
        }
        return top;
    }
}