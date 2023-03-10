class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int colLen = matrix.length;
        int rowLen = matrix[0].length;
        
        List<Integer> spiral = new ArrayList<Integer>(colLen * rowLen);
        
        int col = 0, row = 0;
        int left = 0, right = rowLen -1, top = 0, bottom = colLen - 1;
        
        while (top <= bottom && left <= right){
            while(row < right){
                //go right
                spiral.add(matrix[col][row]);
                row ++;
            }
            top ++;
            if(top > bottom){
                break;
            }
        
            while (col < bottom) {
                //go down
                spiral.add(matrix[col][row]);
                col++;
            }
            right --;
            if (left > right){
                break;
            }
        
            while(row > left){
                //go left
                spiral.add(matrix[col][row]);
                row--;
            }
            bottom--;
            if(top > bottom){
                break;
            }
        
            while ( col > top) {
                //go up
                spiral.add(matrix[col][row]);
                col --;
            }
            left ++;
        }
        spiral.add(matrix[col][row]);
        return spiral;
    }
}
   