class RandomizedSet {
    Set<Integer> set;
    public RandomizedSet() {
        set = new HashSet<>();
    }
    
    public boolean insert(int val) {
        if (set.contains(val)) return false;
        else {
            set.add(val);
            return true;
        }
    }
    
    public boolean remove(int val) {
        if (!set.contains(val)) return false;
        else set.remove(val);
        return true;
    }
    
    public int getRandom() {
        Integer[] setToArray = set.toArray(new Integer[set.size()]);
        Random rndm = new Random();
        int rndmNum = rndm.nextInt(set.size());
        return setToArray[rndmNum];
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */