class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, left = 0, right = 0;
        int totalZeros = 0;
        
        //while in bounds
        while(right < nums.length){
            
            //add the right most element into our window
            if(nums[right] == 0) {
                totalZeros ++;
            }
            
            // if too many zeros, contract window
            while(totalZeros == 2) {
                if(nums[left] == 0) {
                    totalZeros --;
                }
                left++;
            }
            max = Math.max(max, right - left + 1);
            
            //expand our window
            right++;
        }
        return max;
    }
}
