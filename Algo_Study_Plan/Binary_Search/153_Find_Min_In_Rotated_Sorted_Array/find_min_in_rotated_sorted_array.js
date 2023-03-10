/**
 * @param {number[]} nums
 * @return {number}
 */
 var findMin = function(nums) {
    if(nums.length===0){
        return -1
    }
   let start = 0
   let end = nums.length-1
   let mid
   while(start<=end){
    mid = Math.floor((end+start)/2)

    if (nums[mid]<nums[mid-1] && nums[mid]<nums[mid+1]){
        return nums[mid]
    }
    if (nums[mid]<nums[end]){
        end=mid-1


    }
    else if (nums[mid]>nums[end]){
        start=mid+1
    }
    else if (mid==end && mid==start){
        return nums[mid]
    }

}return nums[mid]
};