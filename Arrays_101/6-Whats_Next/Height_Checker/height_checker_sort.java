class Solution {
    public int heightChecker(int[] heights) {
// 1.copy the array to a new array
// 2.sort one of the arrays
// 3.compare the values and count the unequal values 

        int expected[] = new int[heights.length];

//Copy
        for (int i=0; i<heights.length; i++)
            expected[i] = heights[i];

//Sort
        Arrays.sort(heights);
        
//compare and count
        int count = 0;
        for (int j=0; j<heights.length; j++)
            if(heights[j] != expected[j])
                count++;
        return count;
    }
}