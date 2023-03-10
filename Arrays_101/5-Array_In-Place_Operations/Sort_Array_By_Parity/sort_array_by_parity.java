class Solution {
    public int[] sortArrayByParity(int[] nums) {
        if(nums.length < 2) return nums;
        int count = 0;
        for(int i = 0; i < nums.length; i++)
            if(nums[i] % 2 == 0){
                int temp = nums[i - count];
                nums[i - count] = nums[i];
                nums[i] = temp;
            }
            else count++;
        return nums;
        }
}