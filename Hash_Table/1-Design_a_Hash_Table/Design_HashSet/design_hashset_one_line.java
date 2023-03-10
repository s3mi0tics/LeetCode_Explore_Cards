class MyHashSet {
    int[] arr;

    /** Initialize your data structure here */
    public MyHashSet() {
        arr = new int[1000000];
    }

    public void add(int key) {
        arr[hash(key)] = key+1; // handle case key=0
    }
    
    public void remove(int key) {
        arr[hash(key)] = 0;
    }

    /** Returns true if this set did not already contain the specified element */
    public boolean contains(int key) {
        return (arr[hash(key)] !=0);
    }
    
    private int hash(int i) {
        return i;
    }
}
