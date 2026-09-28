class MyHashSet {
    private final int SIZE = 696;
    private final List<List<Integer>> mySet;

    public MyHashSet() {
        mySet = new ArrayList<>(SIZE);
        for (int i = 0; i < SIZE; i++) {
            mySet.add(null);
        }
    }

    private int hash(int key) {
        return key % SIZE;
    }

    public void add(int key) {
        int index = hash(key);       
       if (mySet.get(index) == null) {
           mySet.set(index, new LinkedList<>());
       }

       if (!mySet.get(index).contains(key)) {
           mySet.get(index).add(key);
       }
    }

    public void remove(int key) {
        int index = hash(key);
        if (mySet.get(index) != null) {
            mySet.get(index).remove((Integer) key);
        }
    }

    public boolean contains(int key) {
        int index = hash(key);
        return mySet.get(index) != null && mySet.get(index).contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */