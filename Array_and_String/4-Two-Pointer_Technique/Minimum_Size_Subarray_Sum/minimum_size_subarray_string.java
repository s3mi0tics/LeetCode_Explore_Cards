class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            if(min == 1){
                    return min;
                }
            sum += nums[i];
            
            while(sum >= target){
                min = Math.min(min, i-left + 1);
                sum -= nums[left];
                left ++;
            }

        }
        return (min != Integer.MAX_VALUE) ? min : 0;
    }
}
