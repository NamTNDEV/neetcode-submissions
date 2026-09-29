class MyStack {
private Queue<Integer> myQueue;
    private int size = 0;

    public MyStack() {
        myQueue = new LinkedList<>();
    }

    public void push(int x) {
        myQueue.offer(x);
        for(int i = 0; i < size; i++) {
            myQueue.offer(myQueue.remove());
        }
        size++;
    }

    public int pop() {
        if (myQueue.isEmpty()) return -1;
        size--;
        return myQueue.remove();
    }

    public int top() {
        if (myQueue.isEmpty()) return -1;
        return myQueue.peek();
    }

    public boolean empty() {
        return this.size == 0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */