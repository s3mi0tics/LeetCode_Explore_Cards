class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set jewelSet = new HashSet<>();
        int count = 0;
        for (int i = 0; i<jewels.length(); i++) {
            jewelSet.add(jewels.charAt(i));
        }
        for (int j = 0; j<stones.length(); j++) {
            if (jewelSet.contains(stones.charAt(j))) {
                count ++;
            }
        }
        return count;
    }
}