//Brute force would be too costly
//To find max sum means to minimize the total delta in the pairs
//Therefore the optimal paring would be the min value + the next min value, the next min value + the next min value
//Sorting first is much more efficient than brute force
//then add every even index as it would be the min value of each pairing

class Solution {
    public int arrayPairSum(int[] nums) {
        int maxSum = 0;
        Arrays.sort(nums);
        for (int i=0; i<nums.length-1; i+=2){
            maxSum += nums[i];
        }
        return maxSum;
    }
}