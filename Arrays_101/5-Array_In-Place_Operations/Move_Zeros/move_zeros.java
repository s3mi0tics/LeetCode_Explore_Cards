class Solution {
    public void moveZeroes(int[] nums) {
        //As you traverse the array count the zeros
        int zeroCount = 0;
        
        for(int i = 0; i < nums.length; i++){
            //if the nums[i] is zero then we increase our count of zeros and continue the loop
            if (nums[i] == 0) zeroCount++;
            //if the nums[i] is not zero and the zeroCount is greater than zero
            //replace the zero that is firthest to the left in the array and assign the current value to zero
            else if (zeroCount > 0){
                nums[i-zeroCount] = nums[i];
                nums[i] = 0;
            }
        }   
    }
}
