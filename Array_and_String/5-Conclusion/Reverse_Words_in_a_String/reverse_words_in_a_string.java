class Solution {
    public String reverseWords(String s) {
        StringBuilder reversedWords = new StringBuilder("");
        int i = s.length()-1;
        StringBuilder tempWord = new StringBuilder("");
        // System.out.println(s.charAt(i));
        while(i >= 1){
            if((Character.isWhitespace(s.charAt(i)))){
                i--;
            }  
            while(!(Character.isWhitespace(s.charAt(i))) && i != 0){
                System.out.println(i);
                tempWord.append(s.charAt(i));
                i--;
                // System.out.println(tempWord);
            }
            if(i==0 && (!(Character.isWhitespace(s.charAt(i))))){
                tempWord.append(s.charAt(i));
                reversedWords.append(tempWord.reverse());
                tempWord.setLength(0);
            }
            else if(i==0 && Character.isWhitespace(s.charAt(i))){
                reversedWords.append(tempWord.reverse());
                tempWord.setLength(0);
            }
            else{
             //reverse tempWord and add it to reversedWords
            reversedWords.append(tempWord.reverse()).append(" ");
            tempWord.setLength(0);
            System.out.println(reversedWords);  
            }
        }
            
        return reversedWords.toString(); 
    }
}