//NOTE: this attempt actually doesn't work on all test cases. When the binary numbers are too large the integer for the place holder becomes to large to function as a primitive type. However the logic is good and I felt it worth while to share
class Solution {
    public String addBinary(String a, String b) {
        int indexA = a.length()-1;
        int indexB = b.length()-1;
        int placeValue = 1;
        
        int decA = 0;
        int decB = 0;
        
        //find the decimal value of a
        while(indexA >= 0){
            decA += Character.getNumericValue(a.charAt(indexA))  * placeValue;
            if (placeValue == 1){
                placeValue = 2;
            }else{
                placeValue *= 2;
            }
            indexA --;
            
            // System.out.println("placeValue " + placeValue + " indexA " + indexA + " decA " + decA);
            
        }
        
        //reset the placeValue
        placeValue = 1;
        
        //find the decimal value of b
        while(indexB >= 0){
            decB += Character.getNumericValue(b.charAt(indexB))  * placeValue;
            if (placeValue == 1){
                placeValue = 2;
            }else{
                placeValue *= 2;
            }
            indexB --;
            
            // System.out.println("placeValue " + placeValue + " indexB " + indexB + " decB " + decB);
            
        }
        
        //sum the two decimal values
        int decSum = decA + decB;
        if(decSum == 0) return "0";
        System.out.println(decSum);
        
        //convert the sum back into a binary string
        int binary[] = new int[40];
        int index = 0;
        
        while (decSum > 0){
            binary[index++] = decSum%2;
            decSum = decSum/2;    
        }
        
        StringBuilder str = new StringBuilder();
        for(int i=index-1; i>=0; i--){
            str.append(binary[i]);
        }
        String ans = str.toString(); 
        
        return ans;        
    }
}