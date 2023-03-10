class Solution {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while(i >= 0 || j >= 0){
            int sum = carry;
            if(i >= 0) sum += a.charAt(i--) - '0';
            if(j >= 0) sum += b.charAt(j--) - '0';
            carry = sum > 1 ? 1 : 0;
            res.append(sum % 2);
        }
        if(carry != 0) res.append(carry);
        return res.reverse().toString();
    }
}

//same solution with comments for explination
// class Solution{
//     public String addBinary(String a, String b) {
//         //create an empty StringBuilder to fill and return
//         StringBuilder res = new StringBuilder();
//         int i = a.length() - 1;//create an i pointer for string a, we have to start adding from right to left
//         int j = b.length() - 1;//similiar pointer j for string b
//         int carry = 0;//create a carry, to hold the extra value as we move to the next place
//         //iterate until both conditions become false
//         while(i >= 0 || j >= 0){
//             int sum = carry;// initialize our sum with the value of carry
//             // subtract by '0' to convert the numbers from a char type to an int, so we can perform operations on the numbers
//             if(i >= 0) sum += a.charAt(i--) - '0';
//             if(j >= 0) sum += b.charAt(j--) - '0';
//             carry = sum > 1 ? 1 : 0; // getting carry depend on the quotient we get by dividing sum / 2 that will be our carry. Carry could be either 1 or 0
//             // if sum is 0 res is 1 and carry would be 0
//             // if sum is 1 res is 1 and carry would be 0
//             // if sum is 2 res is 0 and carry would be 1
//             // if sum is 3 res is 1 and carry would be 1 
//             res.append(sum % 2);//modulate the sum so we can get remainder and add it into result
//         }
//         if(carry != 0) res.append(carry); //ad dit into the res until cary becomes 0 
//         return res.reverse().toString();//reverse the res convert it to a String and return it 
//     }
// }

