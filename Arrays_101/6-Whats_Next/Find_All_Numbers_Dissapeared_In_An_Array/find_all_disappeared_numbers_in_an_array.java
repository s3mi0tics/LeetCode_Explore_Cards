class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        //allocate a separate index for each number, then checked which indexes are zero - these are our numbers we are looking for.

        int[] res = new int[nums.length + 1];

        for (int num : nums) {
            res[num] = num;
        }

        List<Integer> result = new ArrayList<>(res.length);
        for (int i = 1; i < res.length; i++) {
            if (res[i] == 0) {
                result.add(i);
            }
        }
        return result;
    }
}

//ALTERNATE SOLUTION

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        initialize a new list to store missing numbers
        initialize a pointer that will represent an integer that appears in the range
        for each value in nums find that index and make it a negitive number
        add to the missing numbers array list every index+1 that is not a negitive number        
        List<Integer> missingNums = new ArrayList<>();
        int rep = 0;
        
        for(int val : nums){
            //make the number represented at that index negative
            if (val < 0)
                rep = (val * -1) -1;
            else
                rep = val - 1;
            if(nums[rep] > 0)
                nums[rep] = -nums[rep];
        }
        
        for (int i= 0; i < nums.length; i++){
            if (nums[i] > 0)
                missingNums.add(i+1);
        }
        return missingNums;
    }
}