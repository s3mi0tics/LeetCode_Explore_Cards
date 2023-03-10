class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        Map<Integer, Integer> hashmap = new HashMap<>();
        
        for (int i = 0; i<nums.length; i++) {
            int compliment = target - nums[i];
            if (hashmap.containsKey(compliment)) {
                return new int[] {i, hashmap.get(compliment)};
            }
            hashmap.put(nums[i], i);
        }
        return null;
    }
}