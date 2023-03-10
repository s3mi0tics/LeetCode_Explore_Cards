class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        Map<Integer, Integer> hashmap = new HashMap<>();
        
        for (int i=0; i<nums.length; i++) {
            hashmap.put(nums[i], i);
        }
        
        
        for (int j = 0; j<nums.length; j++){
            if (hashmap.containsKey(target - nums[j]) && hashmap.get(target-nums[j]) != j) {
                ans[1] = hashmap.get(target - nums[j]);
                ans[0] = (j);
                return ans;
            }
        }
        return ans;
    }
}