class Solution:
    def minDistance(self, word1: str, word2: str) -> int:
        
        #create a 2 dimentional grid
        #the number of rows is equal to the length of word2 plus one
        # the number of columns is equal to length of word1 plus one
        #initialize all values in the grid the with float infinity (max integer)
        cache = [[float("inf")] * (len(word2) + 1) for i in range(len(word1) +1)]
        
        
        # initialize the base case by replacing the values in the right most column and bottom row decrementing by 1 as you move down and to the left so that the bottom right corner is 0 and the bottom left corner is the length of word2 and the top left corner is the length of word1
        for j in range(len(word2) + 1):
            cache[len(word1)][j] = len(word2) - j


        for i in range(len(word1) + 1):
            cache[i][len(word2)] = len(word1) -i
         
        #working backwards through the grid
        for i in range(len(word1) - 1, -1, -1):
            for j in range(len(word2) - 1, -1, -1):
                # if the letters are the same move on
                if word1[i] == word2[j]:
                    cache[i][j] = cache[i + 1][j + 1]
                #if the letters are not the same add 1 + what ever the minimum value of either the insert delete or replace
                else:
                    cache[i][j] = 1 + min(cache[i + 1][j], cache[i][j+1], cache[i+1][j + 1])
        return cache[0][0]