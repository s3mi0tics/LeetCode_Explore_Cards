 class Solution {
    public void duplicateZeros(int[] arr) {
        //declare i and assign the value of 0 so we can traverse the array
        //declare sh and assign the value of 0 so we can count how many shifts we can fit into our array
        int i = 0, sh = 0;
        
        //Go from left to right and add how many shifts we can fit into our array
        //Use the sum of the index and the number of shifts to define the condition for running the for loop
        for(i = 0; sh + i < arr.length; i++){
            sh += arr[i] == 0 ? 1 : 0;
        }
        
        //Go from right to left and move items to the end; if it is a zero then duplicate it and decrement the shift
        for(i = i-1; sh > 0; i--){
            if(i + sh < arr.length) arr[i+sh] = arr[i];
    if(arr[i] == 0) arr[i + --sh] = arr[i];
            }
    } 
}