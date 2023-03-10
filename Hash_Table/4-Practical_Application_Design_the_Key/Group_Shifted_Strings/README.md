# Intuition

Using ASCII we can convert each ```char``` to an ```int```. In this case it is all lowercase English letters. ASCII values are ```a=97, b=98,...y=121,z=122``` If we shift the every letter over the value of the first letter the result will set the first value equal to 0 on all strings

Then we can get the difference of each subsequent letter and use a Hash Map to store all strings that are equal.

The tricky part is that we must use the modulo of 26 (the number of letters in the alphabet) to account for the ```circular shift``` i.e. from z to a.

## Code

```JAVA
class Solution {
    public List<List<String>> groupStrings(String[] strings) {
        if (strings.length == 0) return new ArrayList();
        Map<List<Integer>, List<String>> map = new HashMap<>();
        
        for (String string : strings) {
            List<Integer> intArray = new ArrayList<Integer>(string.length());
            int firstCharAscii = string.charAt(0);

            for (int i=0; i<string.length(); i++) {
                int charAscii = string.charAt(i);
                
                // Note: We do a modulo of 26 to account for the circular shift.
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
```
