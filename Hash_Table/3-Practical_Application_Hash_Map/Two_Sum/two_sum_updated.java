class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashmap = new HashMap<>();
        
        for (int i = 0; i<nums.length; i++) {
            hashmap.put(nums[i], i);
        }
        
        
        for (int i = 0; i<nums.length; i++){
            int compliment = target - nums[i];
            if (hashmap.containsKey(compliment) && hashmap.get(compliment) != i) {
                return new int[] {i, hashmap.get(compliment)};
            }
        }
        return null;
    }
}