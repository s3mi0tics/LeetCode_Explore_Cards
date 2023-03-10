// Three great ways of solving:

//Solution 1:
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums == null)
             return 0;
        int max = 0, count = 0;
        for (int i = 0; i < nums.length; i++){
            count += 1;
            if (nums[i] != 1)
                count = 0;
            else
                if (count > max)
                    max = count;
        }
        return max;
    }
}

//Solution 2 using ternery operator and Math.max:
class Solution{
    public int findMaxConsecutiveOnes(int[] nums){
        if(nums == null)
            return 0;
        int max = 0, count = 0;
        for(int num : nums) {
            count = num == 0 ? 0 : count + 1;
            max = Math.max(count, max);
        }
        return max;
    }
}  

//Solution 3 using dynamic programming:
class Solution{
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums == null)
            return 0;
        int max = 0, count = 0;
        for (int num : nums)
            max = Math.max(max, count = num == 0 ? 0 : count +1);
        return max;
            
    }
}

