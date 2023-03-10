class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int result[] = new int[n];
        int l = 0, r = n - 1;
        for (int i = n - 1; i >= 0; i--){
            if(Math.abs(nums[l]) > Math.abs(nums[r])){
                result[i] = nums[l] * nums[l];
                l++;
            } else {
                result[i] = nums[r] * nums[r];
                r--;
            }
        }
        return result;
    }
}
