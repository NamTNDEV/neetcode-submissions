class Solution {
    public int calPoints(String[] operations) {
        int[] stack = new int[operations.length];
        int total = 0;
        int top = -1;

        for (int i = 0; i < operations.length; i++) {
            String ops = operations[i];
            switch (ops) {
                case "+" -> {
                    int tmp = stack[top] + stack[top - 1];
                    stack[++top] = tmp;
                    total += tmp;
                }
                case "C" -> {
                    total -= stack[top--];
                }
                case "D" -> {
                    int tmp = stack[top] * 2;
                    stack[++top]= tmp;
                    total += tmp;
                }
                default -> {
                    int num = Integer.parseInt(ops);
                    stack[++top] = num;
                    total += num;
                }
            };
        }

        return total;
    }
}