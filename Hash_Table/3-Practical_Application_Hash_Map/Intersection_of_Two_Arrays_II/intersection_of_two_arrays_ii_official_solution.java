class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // Its a good idea to check the length of the arrays and use the smaller one
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums1) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        int k = 0; // Initialize k to update the values in nums1
        for (int n : nums2) {
            int count = map.getOrDefault(n, 0);
            if (count > 0) {
                nums1[k++] = n; // update the value in nums1[k] and incriment k
                map.put(n, count -1);
            }
        }
        return Arrays.copyOfRange(nums1, 0, k); //return the first k elements of the updated nums1
    }
}
