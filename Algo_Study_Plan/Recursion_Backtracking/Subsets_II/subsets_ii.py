class Solution:
    def subsetsWithDup(self, nums: List[int]) -> List[List[int]]:
        res = []
        nums.sort()

        def bt(current, subset):
            if(current == len(nums)):
                res.append(subset[::])
                return
        #all subsets that include nums[current]/Users/colbykauk/Desktop/Algos/Leetcode_algo_study_plan/Binary_Search/33_Search_In_Rotated_Sorted_Array/README.md
            subset.append(nums[current])
            bt(current+1, subset)
            subset.pop()
            
        #all subsets that dont include nums[curent]
            while current +1 < len(nums) and nums[current] == nums[current+1]:
                current += 1
            bt(current+1, subset)
            
        bt(0, [])
        return res
                