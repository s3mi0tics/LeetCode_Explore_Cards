class Solution {
    public void rotate(int[] nums, int k) {     
        //first you need start middle and end pointers
        int start = 0;
        k = k % nums.length;
        int end = nums.length -1;
       
         //second you need to reverse the first half of the array {1, 2, 3, 4} => {4, 3, 2, 1}
        reverse(nums, start, end - k);
        //third you need to reverse the second half of the array {5, 6, 7} => {7, 6, 5}
        reverse(nums, nums.length -k, end);
        
        //fourth flip the array {4, 3, 2, 1, 7, 6, 5} => {5, 6, 7, 1, 2, 3, 4}
        reverse(nums, start, end);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end){
            nums[start] ^= nums[end];
            nums[end] ^= nums[start];
            nums[start++] ^= nums[end--];
        }
    }
}

//Time complexity: O(n)
//Space complexity: O(1)