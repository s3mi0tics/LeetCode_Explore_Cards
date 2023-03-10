class Solution {
    public List<List<String>> groupStrings(String[] strings) {
        if (strings.length == 0) return new ArrayList();
        Map<List<Integer>, List<String>> map = new HashMap<>();
        
        for (String string : strings) {
            List<Integer> intArray = new ArrayList<Integer>(string.length());
            int firstCharAscii = string.charAt(0);

            for (int i=0; i<string.length(); i++) {
                int charAscii = string.charAt(i);
                
                // We have to do a mod of 26 on the resulting character for the circular shift.
                intArray.add((charAscii - firstCharAscii + 26) % 26);   
            }
            if (!map.containsKey(intArray)) {
                map.put(intArray, new ArrayList());
                
            }
            map.get(intArray).add(string);
        }       
        return new ArrayList(map.values());
    }
}