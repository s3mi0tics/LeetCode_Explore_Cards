class Solution:
    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        res = []
        # candidates.sort()
        
        #bt function that takes in a canidate and a uniqueComb
        def bt(i, uniqueComb):
            if i >= len(candidates):
                return
            if sum(uniqueComb) == target:
                res.append(uniqueComb[::])
                return
            if sum(uniqueComb) < target:
                uniqueComb.append(candidates[i])
                bt(i, uniqueComb)
                uniqueComb.pop()
            bt(i+1, uniqueComb)
        bt(0, [])
        return res
                