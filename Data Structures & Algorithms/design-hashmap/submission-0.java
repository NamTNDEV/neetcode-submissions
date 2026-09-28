class MyHashMap {
    private static class Node {
        int key;
        int value;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int SIZE = 1009;
    private final List<List<Node>> myMap;

    public MyHashMap() {
        myMap = new ArrayList<>(SIZE);
        for (int i = 0; i < SIZE; i++) {
            myMap.add(new LinkedList<>());
        }
    }

    private int hash(int key) {
        return key % SIZE;
    }

    public void put(int key, int value) {
        int hashedKey = hash(key);

        for (Node node : myMap.get(hashedKey)) {
            if (node.key == key) {
                node.value = value;
                return;
            }
        }
        
        myMap.get(hashedKey).add(new Node(key, value));
    }

    public int get(int key) {
        int hashedKey = hash(key);

        for (Node node : myMap.get(hashedKey)) {
            if (node.key == key) {
                return node.value;
            }
        }

        return -1;
    }

    public void remove(int key) {
        int hashedKey = hash(key);

        Iterator<Node> iterator = myMap.get(hashedKey).iterator();
        while (iterator.hasNext()) {
            Node node = iterator.next();
            if (node.key == key) {
                iterator.remove();
                return;
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */