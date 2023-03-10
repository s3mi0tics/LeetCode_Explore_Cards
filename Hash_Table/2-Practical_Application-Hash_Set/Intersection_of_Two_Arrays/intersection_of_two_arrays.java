class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        Set<Integer> hashset = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();
        for (Integer key : nums1){
            hashset.add(key);
        }
        for (Integer key : nums2) {
            if (hashset.contains(key)) {
                intersection.add(key);
            }
        }
        int[] ans = new int[intersection.size()];
        int i = 0;
        for (Integer num : intersection) {
            ans[i] = num;
            i++;
        }
        return ans;
    }
}