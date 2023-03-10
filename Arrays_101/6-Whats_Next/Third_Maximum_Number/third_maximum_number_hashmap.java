//This solution is not optimal for time but is more scaleable

class Solution {
    public int thirdMax(int[] nums) {
        int nthMax = 3;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }

        List<Integer> list=new ArrayList<>(set);
        Collections.sort(list);
        if(list.size() < nthMax){
            return list.get(list.size() - 1);
        }
            return list.get(list.size() - nthMax);
    }
}