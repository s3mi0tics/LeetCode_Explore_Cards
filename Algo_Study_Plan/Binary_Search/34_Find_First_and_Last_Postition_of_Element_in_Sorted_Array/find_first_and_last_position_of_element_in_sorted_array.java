class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = 0;
        int last = nums.length -1;
        int[] result = {-1, -1};
        
        //Edge cases
        if(nums.length == 0) {
            return result;
        } 
        
        //Find the first position
        while(first < last) {
            int mid = (first + last) / 2;
            if(nums[mid] < target) {
                first = mid +1;
            }
            else {
                last = mid;
            }
        }
        if(nums[first] == target) {
            result[0] = first;
            }
        else {
           return result;
        }
        
        //Find the last position
        //Reset last, first does not need to be reset
        last = nums.length - 1;
        while(first < last){
            int mid = ((first + last)/2) + 1; //add 1 to mid to keep start from getting stuck
            if(nums[mid] > target) {
                last = mid - 1;
            }
            else {
                first = mid;
            }       
        }
        result[1] = last;
        return result;    
    }
}