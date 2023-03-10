class Solution {
    public int strStr(String haystack, String needle) {
        //check for the first letter of needle in haystack
        for(int i=0; i<haystack.length(); i++){
            //if haystack.length - i + 1 < needle.length return -1
            if(haystack.length()-i < needle.length()) return -1;
            
            //if first letter found iterate through both checking to see if each letter matches until the end of needle
            if(haystack.charAt(i) == needle.charAt(0)){
                for(int j=0; j<needle.length(); j++){
                    
                    //if you reach the end of needle then return the index of the first letter on haystack => i
                    if(j == needle.length() -1 && haystack.charAt(i+j) == needle.charAt(j)) return i;
                    if(haystack.charAt(i+j) == needle.charAt(j)) continue;
                    // if they dont match then start continue iterating through i
                    else break;
                }
            }
        }  
        return -1;
    }
}