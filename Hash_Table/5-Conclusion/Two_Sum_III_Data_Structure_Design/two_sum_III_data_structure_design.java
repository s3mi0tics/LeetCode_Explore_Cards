class TwoSum {
    Map<Integer, Boolean> map;
    int count = 0;
    public TwoSum() {
        map = new HashMap<>();  
    }
    
    public void add(int number) {
        if (map.containsKey(number)) {
            map.put(number, true);
            count += 1;
        }
        else {
            map.put(number, false);
            count += 1;
        }
    }
    
    public boolean find(int value) {
        if (count < 2) return false;
        for (Map.Entry<Integer, Boolean> num : map.entrySet()) {
            if (value - num.getKey() == num.getKey() && num.getValue() == true) {  
                return true;
            }
            if (map.containsKey(value - num.getKey()) && value - num.getKey() != num.getKey()) {
                return true;
            }
        }
        return false;
    }
}

/**
 * Your TwoSum object will be instantiated and called as such:
 * TwoSum obj = new TwoSum();
 * obj.add(number);
 * boolean param_2 = obj.find(value);
 */