class Solution:
    def search(self, nums: List[int], target: int) -> int:
        
        if not nums:
            return -1
    
        low = 0
        high = len(nums) -1
        
    
        while low <= high:
            
            mid = (low + high) // 2 
            if nums[mid] == target:
                return mid
            
            # Pivot point to the right. Left is strictly increasing
            if nums[low] <= nums[mid]:
                if nums[low] <= target <= nums[mid]:
                    high = mid -1
                else:
                    low = mid + 1
            
            #Pivot point to the left. Right is strictly increasing    
            else:
                if nums[mid] <= target <= nums[high]:
                    low = mid +1
                else:
                    high = mid - 1
        
        return -1

#values from nums[0] until the the pivot point are ascending. And values from (pivot point + 1) until nums[len(nums) - 1] are ascending. #Values from nums[0] until the pivot point are always bigger than values from (pivot point + 1) until nums[len(nums) - 1] 