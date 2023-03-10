class MyHashMap {
    public int[] map;
    /** Initialize your data structure here. */
    public MyHashMap() {
        this.map = new int[1000000];
        for (int i = 0; i < 100000; i++) {
            this.map[i] = -1;
        }
    }

    /** Value will always be positive. */
    public void put(int key, int val) {
        this.map[key] = val;
    }

    /** Returns the value to which the specified key is mapped, or -1 of this map contains no mapping for the key */
    public int get(int key) {
        return this.map[key];
    }

    /** Removes the mapping of the specified value key if htis map contains a mapping for the key */
    public void remove(int key) {
        this.map[key] = -1;
    }
}


/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */