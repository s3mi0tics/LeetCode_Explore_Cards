// The tricky part was knowing whether or not to go up or down. Problem solved by declaring a boolean called up.
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int rowLen = mat.length;
        int colLen = mat[0].length;
        int m = mat.length;
        int[] result = new int[colLen*rowLen];
        int row = 0, col = 0, index = 0;
        boolean up = true;
        
        while (index < result.length){
            result[index] = mat[row][col];
            
            if(up){
                if(row == 0 && col < colLen - 1){
                    col++;
                    up = false;
                }
                else if (col == colLen-1) {
                    row++;
                    up = false;
                }
                else {
                    row--;
                    col++;
                }
            }
            else{
                if(col == 0 && row < rowLen-1){
                    row++;
                    up = true;
                }
                else if (row == rowLen-1) {
                    col++;
                    up = true;
                }
                else {
                    row++;
                    col--;
                }  
            }
            index ++;
        }   
        return result;
    }
}