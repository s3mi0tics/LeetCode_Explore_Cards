
/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var numSubarrayProductLessThanK = function(nums, k) {
    let output=0;
    let currentProduct=1;
    let left=0;
    
    if (k<=1){
        return output
    }
    for (let right=0;right<nums.length;right++){
      
        currentProduct*=nums[right]
        
        
        while (currentProduct>=k){
            currentProduct/=nums[left]
            left++
        }
        
        output+=right-left+1
    }
    return output;
};