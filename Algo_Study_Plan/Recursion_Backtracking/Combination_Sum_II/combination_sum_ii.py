class Solution:
    def combinationSum2(self, candidates: List[int], target: int) -> List[List[int]]:
        res = []
        candidates.sort()
        
        def bt(i, uniqueComb):
            print("i", i)
            
            if i >= len(candidates):
                return
        
            if sum(uniqueComb) == target:
                res.append(uniqueComb[::])
                print("res.append", uniqueComb)
                return
            
            if sum(uniqueComb) > target:
                print("uniqueComb.pop()", uniqueComb)
                uniqueComb.pop()
                bt(i+1, uniqueComb)
            
            if sum(uniqueComb) < target:
                uniqueComb.append(candidates[i])
                print("uniqueComb is", uniqueComb)
                bt(i+1, uniqueComb)
                uniqueComb.pop()

        #begin the backtracking function at i of 0 with an empty subset
        bt(0, [])
        return res