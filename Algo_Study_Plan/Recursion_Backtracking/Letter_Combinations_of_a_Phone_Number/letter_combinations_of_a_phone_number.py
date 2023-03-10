class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        res = []
        dictionary = {"2":"abc", "3":"def", "4":"ghi", "5":"jkl", "6":"mno", "7":"pqrs", "8":"tuv", "9":"wxyz"}

        if not digits:
            return []
        def backtrack(digits, i, j, letterComb):
            if i > len(digits) -1:
                res.append(letterComb)
                # print("res", res)    
                return
            if len(letterComb) != len(digits):
                for letter in dictionary[digits[i]]:
                    letterComb += letter
                    backtrack(digits, i+1, j, letterComb)
                    # print("prepop", letterComb)   
                    letterComb = letterComb[:-1]
                    # print("postpop", letterComb)
        backtrack(digits, 0, 0, "")
        return res   