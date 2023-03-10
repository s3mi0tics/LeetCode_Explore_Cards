class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = 9;
        Map<Character,List<Integer>> mapRow = new HashMap<>(n);
        Map<Character,List<Integer>> mapCol = new HashMap<>(n);
        Map<Character, List<Double>> mapSubBox = new HashMap<>(n);
        
        // Iterate through the whole Board with a double for loop and add values to the rows, columns and sub-boxes
        for (int r=0; r < n; r++) {
            for (int c=0; c < n; c++){               
                // Dont add the '.' value to the HashMap
                char period = '.';
                if (period == board[r][c]) continue;
                
                // Add key to the row hashmap
                if (!mapRow.containsKey(board[r][c])) {
                    mapRow.put(board[r][c], new ArrayList<Integer>());

                }
                // Return false if the key is already exists in that row
                if (mapRow.get(board[r][c]).contains(r)) return false;
                // Add that row to the key
                mapRow.get(board[r][c]).add(r);
                
                // Add key to the column hashmap
                if (!mapCol.containsKey(board[r][c])) {
                    mapCol.put(board[r][c], new ArrayList<Integer>());
                }
                // Return false if the key is already exists in that column
                if (mapCol.get(board[r][c]).contains(c)) return false;
                // Add that row to the key
                mapCol.get(board[r][c]).add(c);
                   
                
                // Add key to SubBox Hashmap using Math.floor(r/3) *3 + Math.floor(c/3) to indicate which sub-box
                Double subBox = Math.floor(r/3) *3 + Math.floor(c/3);
                if (!mapSubBox.containsKey(board[r][c])){
                    mapSubBox.put(board[r][c], new ArrayList<Double>());
                }
                // Return false if the key already exists in that sub-box
                if (mapSubBox.get(board[r][c]).contains(subBox)) return false;
                // Add that sub-box to the key
                mapSubBox.get(board[r][c]).add(subBox);
            }
        }        
        return true;
    } 
}