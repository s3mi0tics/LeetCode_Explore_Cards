class Solution:
    def lengthOfLIS(self, nums: List[int]) -> int:
        LIS = [1] * len(nums)
        
        #using i as the index we iterate backwards through nums 
        #start at the last index, end at index 0, decrement by 1
        
        for i in range(len(nums) -1, -1, -1):
            
            #for every i we need to find that number plus the longest subsequence after it 
            #we using j to iterate through nums
            #start at the next index, end at the last index of nums, increment by one.
            
            for j in range(i+1, len(nums)):
                
                #check to see that the value of i is less then j to meet the condition of an increasing subsequence
                
                if nums[i] < nums[j]:
                    
                    #then we can update the Longest Increasing Subsequence at index i
                    #we can set it at the max of itself or the max of 1 + the LIS starting at j
                    
                    LIS[i] = max(LIS[i], 1 + LIS[j])
                    
        return max(LIS)