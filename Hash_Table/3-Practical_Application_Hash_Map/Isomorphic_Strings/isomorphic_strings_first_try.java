class Solution {
    public boolean isIsomorphic(String s, String t) {

        //We will need two dictionaries instead of one since we need a one-to-one mapping from string s to string t
        Map<Character, Character> map_s_t = new HashMap();
        Map<Character, Character> map_t_s = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            
            // If character already has mapping but its different then the existing mapping for map_s_t
            if (map_s_t.containsKey(sChar) && map_s_t.get(sChar) != tChar) {
                return false;
            }
            // If characther already has mapping but its different then the existing mapping for map_t_s 
            else if (map_t_s.containsKey(tChar) && map_t_s.get(tChar) != sChar) {
                return false;
            }
            // If characters don't have mapping or mapping exists that is equal
            // Note: will replace original if already equal
            else {
                map_s_t.put(sChar, tChar);
                map_t_s.put(tChar, sChar);
            }
        }
        return true;
    }
}