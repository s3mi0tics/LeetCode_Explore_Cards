class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        
        // HashMap from list one with the strings as the key and index as the value
        HashMap < String, Integer > mapList1 = new HashMap <>();
        for (int i=0; i< list1.length; i++) {
            mapList1.put(list1[i], i);
        }
        
        List <String> ans = new ArrayList<>();
        int min_sum = Integer.MAX_VALUE, sum;

        for (int j=0; j<list2.length && j <= min_sum; j++) {
            if (mapList1.containsKey(list2[j])) {
                sum = j + mapList1.get(list2[j]);
                if (sum < min_sum) {
                    ans.clear();
                    ans.add(list2[j]);
                    min_sum = sum;
                } else if (sum == min_sum) {
                    ans.add(list2[j]);
                }
            }
        }
        return ans.toArray(new String[ans.size()]);
    }
}
