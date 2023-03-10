// using a while loop
class Solution {
    public int[] sortedSquares(int[] nums) { 
        //declare variable n and assign it to the length of nums
        int n = nums.length;
        //create a new array for sorted numbers and give it a capacity of n
        int ans[] = new int[n];
        
        //declare a left pointer and assign it the value of 0 to start
        int l = 0;
        //declare a right pointer and assign it the value of n
        int r = n-1;
        //declare an index and assign it the value of n
        int i = n-1;
        
        //initialize the while loop. So long as the left pointer is less than or equal to the right pointer
        while(l<=r){
            //find the square of the left and right pointers
            int lSq = nums[l] * nums[l];
            int rSq = nums[r] * nums[r];
            //compare to see which is larger
            
            if(lSq > rSq){
            //if the left is larger put the lSq in the last open index of the answer increase left by 1
                ans[i] = lSq;
                l++;
            }
            else{
            //else put the rSq in the last open index of ans and decrease the right by 1    
                ans[i] = rSq;
                r--;
            }
            //decrease the last open index of ans
            i--;
            //go back to while loop    
        }
        //return the new squared and sorted array
        return ans;
    }
}