class Solution:
    def exist(self, board: List[List[str]], word: str) -> bool:
        
        #total number of is less than the word
        if len(board) * len(board[0]) < len(word):
            return False
            
        def backtrack(column, row, i):
            if i >= len(word):
                return True

            if row < 0 or column < 0 or column >= len(board) or row >= len(board[0]) or board[column][row] == "#" or word[i] != board[column][row]:
                return False
            temp = board[column][row] 
            board[column][row] = "#"
            i += 1  
            a = backtrack(column + 1, row, i) or backtrack(column - 1, row, i) or backtrack(column, row + 1, i) or  backtrack(column, row - 1, i)
            board[column][row] = temp
            return a
        
        for x in range(0, len(board)):
            for y in range (0, len(board[0])):
                if board[x][y] == word[0]:
                    w = backtrack(x, y, 0)
                    if w == True:
                        return True
        return False
                