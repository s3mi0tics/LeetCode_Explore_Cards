#code by dev-josh on leetcode. Although not the most efficient I found this approach to be quite intelegent.
class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        
        def search(x):
            lo, hi = 0, len(nums)           
            while lo < hi:
                mid = (lo + hi) // 2
                if nums[mid] < x:
                    lo = mid+1
                else:
                    hi = mid                    
            return lo
        
        lo = search(target)
        hi = search(target+1)-1
        
        if lo <= hi:
            return [lo, hi]
                
        return [-1, -1]


# Explaination regarding cases from simite200 on LeetCode

# search function
#    find the lowest index of target num in nums
#         if there is target num in nums
#             lo = lowest index of target
#             hi = lowest index of target
#         if there is no target num in nums
#             if there is higher num than target in nums
#                 lo = lowest index of the first higher num than target in nums
#                 hi = lowest index of the first higher num than target in nums
#             if there is no higher num than target in nums
#                 lo = len(nums)
#                 hi = len(nums)
# after lo = search(target), hi = search(target+1) -1
# if there is more than one target num
#     lo = lowest index of target
#     hi = (lowest index of the first higher num than target) -1 ( highest index of target)
#     then, lo < high
# elif there is only one target num
#     lo == high
# else
#     if there is only higher number than target in nums
#         lo = lowest index of the first higher num than target(at least target+1 or higher)
#         hi = lowest index of the (target+1) - 1
#         then, lo > high
#     if there is only lower number than target in nums
#         lo = len(nums)
#         hi = len(nums)-1
#         then, lo > high