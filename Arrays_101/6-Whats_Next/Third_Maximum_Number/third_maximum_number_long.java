//While this optimized for speed by using long instead of integer it still lacks extensibility due to hard coding
class Solution {
    public int thirdMax(int[] nums) {
	    //use long data type since nums can contain Integer.MIN_VALUE
        long max = Long.MIN_VALUE, max2nd = Long.MIN_VALUE, max3rd = Long.MIN_VALUE;
        
        for(int val : nums) {
            if(val > max){
                max3rd = max2nd;
                max2nd = max;
                max = val;
            }
            else if(val > max2nd && val != max) {
                max3rd = max2nd;
                max2nd = val;
            }
            else if(val > max3rd && val != max2nd && val != max){
                max3rd = val;
            }
        }
        
        // if third max was not updated, return the first Max
        return max3rd == Long.MIN_VALUE ? (int) max : (int) max3rd;