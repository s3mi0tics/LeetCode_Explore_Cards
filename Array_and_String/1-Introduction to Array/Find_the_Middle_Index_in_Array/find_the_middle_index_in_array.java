class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0, leftSum = 0;
        // find total sum
        for (int num : nums) sum += num;
        //search to see if there is a place where left sum is equal to (total sum - left sum - nums[i])
        for (int i = 0; i < nums.length; i++){
            if(leftSum == sum -leftSum -nums[i])
                return i;
            leftSum += nums[i];
        }
        return -1;
    }
}