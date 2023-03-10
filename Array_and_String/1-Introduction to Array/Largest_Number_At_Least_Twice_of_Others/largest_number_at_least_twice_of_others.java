class Solution {
    public int dominantIndex(int[] nums) {
        int ans = -1;
        int largest = Integer.MIN_VALUE;
        int nextLargest = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                nextLargest = largest;
                largest = nums[i];
                ans = i;              
            }
            else if (nums[i] > nextLargest) {
                nextLargest = nums[i];
            }
        }
        return largest >= (nextLargest * 2) ? ans : -1;
    }
}