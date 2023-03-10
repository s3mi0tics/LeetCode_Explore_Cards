class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> hashMap = new HashMap<>();
        for (int i=0; i<s.length(); i++) {
            if (hashMap.containsKey(s.charAt(i))) {
                int plusOne = hashMap.get(s.charAt(i)) + 1;
                hashMap.put(s.charAt(i), plusOne);
            }
            else {
                hashMap.put(s.charAt(i), 1);
            }
        }
        
        for (int i = 0; i<s.length(); i++) {
            if (hashMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}