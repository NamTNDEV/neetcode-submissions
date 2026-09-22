class Solution {
    public int calPoints(String[] operations) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int total = 0;

        for (int i = 0; i < operations.length; i++) {
            String ops = operations[i];
            if (ops.equals("+")) {
                int top1 = stack.pop();
                int tmp = top1 + stack.peekFirst();
                stack.push(top1);
                stack.push(tmp);
                total += tmp;
            } else if (ops.equals("C")) {
                total -= stack.pop();
            } else if (ops.equals("D")) {
                int tmp = stack.peekFirst() * 2;
                stack.push(tmp);
                total += tmp;
            } else {
                int num = Integer.parseInt(ops);
                stack.push(num);
                total += num;
            }
        }

        return total;
    }
}