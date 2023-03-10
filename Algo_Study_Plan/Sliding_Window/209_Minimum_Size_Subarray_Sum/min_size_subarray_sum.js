/**
 * @param {number} target
 * @param {number[]} nums
 * @return {number}
 */
 var minSubArrayLen = function(target, nums) {
    let output = 0
    let left = 0
    let currentSum = 0
    let currentSize = 0
    for(let right=0; right<nums.length; right++){
        if(output == 1){
            return 1
        }
        currentSum+=nums[right]
        currentSize++
        while(currentSum >= target){
            if(output == 0){
                output = (right-left +1)
            }
            if(currentSize<output){
                output=currentSize
                currentSum -= nums[left]
                left++
                currentSize--
            }
            else{
                currentSum -= nums[left]
                left++
                currentSize--
            }

    }
    }
    return output
};