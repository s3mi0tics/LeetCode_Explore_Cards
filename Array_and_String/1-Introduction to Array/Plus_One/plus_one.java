class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            //if digits[i] is less then 9 add one digits[i] and return the array
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // if it is a nine make it a zero and continue looping back until you dont find a nine
            digits[i] = 0;
        }
        // if you break out of the for loop without returning then that means they were all nines and you will need to create a new array with one more space in memory and make the first index a 1
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
