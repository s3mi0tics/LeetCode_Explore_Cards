class Solution {
    public String reverseWords(String s) {
       int n = s.length();
        StringBuilder ans = new StringBuilder("");
        StringBuilder word = new StringBuilder("");
        
        for(int i=n-1; i>=0; i--){
            char ch = s.charAt(i);
            
            if( ch!= ' ' ) word.append(ch);
            
            if( (ch==' ' || i==0) && word.length()>0 ) {
                if( ans.length()>0 ) ans.append(" ");
                ans.append(word.reverse());
                word.setLength(0);
            }
        }
        return ans.toString();
    }
}
