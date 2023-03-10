class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for (int key : nums1) {
            if (map1.containsKey(key)) {
                map1.put(key, map1.get(key) + 1);
            }
            else map1.put(key, 1);
        }
        
        for (int key : nums2) {
            if (map2.containsKey(key)) {
                map2.put(key, map2.get(key) + 1);
            }
            else map2.put(key, 1);
        }
        
        for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
            int key = entry.getKey();
            if (map2.containsKey(key)) {
                int count = Math.min(map1.get(key), map2.get(key));
                for (int i=0; i < count; i++) {
                    ans.add(key);   
                }  
            }    
        }
        int[] ret = ans.stream().mapToInt(Integer::intValue).toArray();
        return ret;
        
    }
}