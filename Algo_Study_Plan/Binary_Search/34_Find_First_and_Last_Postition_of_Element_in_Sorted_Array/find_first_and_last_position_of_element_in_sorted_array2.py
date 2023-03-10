class Solution(object):
    def searchRange(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        first, last = 0, len(nums) -1
        res = [-1, -1]
        
        #edge cases
        if len(nums) == 0 or len(nums) == None or target < nums[0] or target > nums[len(nums) - 1]:
            return res
        
        #finding the first position:
        while first < last:
            mid = (first + last) // 2
            if nums[mid] < target:
                first = mid + 1
            if nums[mid] >= target:
                last = mid
        
        if nums[first] != target:
            return res
        else:
            res[0] = first
        
        #finding the last position        
        last = len(nums) -1 #reset last, we dont have to reset first
        
        while first < last: 
            mid = (first + last) // 2 + 1 # add one to the mid point so start doesn't get stuck
            if nums[mid] > target:
                last = mid - 1
            if nums[mid] <= target:
                first = mid
        res[1] = last
        return res