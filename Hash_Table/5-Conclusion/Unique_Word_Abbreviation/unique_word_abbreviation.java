class ValidWordAbbr {
    Map<String, String> map;
    public ValidWordAbbr(String[] dictionary) {
        map = new HashMap<>();
        for (String str: dictionary){
            String key = getAbbr(str);
            if (map.containsKey(key)) {
               if (!map.get(key).equals(str)) {
                    map.put(key, "");
                } 
            } 
            else map.put(key, str);
        }
           
    }
    
    public boolean isUnique(String word) {
        return !map.containsKey(getAbbr(word)) || map.get(getAbbr(word)).equals(word);
    }
    
    public String getAbbr(String word) {
        if (word.length() <= 2) return word;
        return word.charAt(0) + Integer.toString(word.length() - 2) + word.charAt(word.length()-1);
    }
}

/**
 * Your ValidWordAbbr object will be instantiated and called as such:
 * ValidWordAbbr obj = new ValidWordAbbr(dictionary);
 * boolean param_1 = obj.isUnique(word);
 */
