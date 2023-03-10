class Solution {
    public String reverseWords(String s) {
        StringBuilder word = new StringBuilder("");
        StringBuilder answer = new StringBuilder("");
        for(int i=0; i<s.length(); i++){            
            if(Character.isWhitespace(s.charAt(i))){
                answer.append(word.reverse()).append(s.charAt(i));
                word.setLength(0);
            }
            else{
                word.append(s.charAt(i));
            }
        } 
        answer.append(word.reverse());
        return answer.toString();
    }
}