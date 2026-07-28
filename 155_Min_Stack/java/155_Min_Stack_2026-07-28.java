class MinStack {

    private Stack<int[]> stack;
    private int min;

    public MinStack() {
        stack = new Stack<>();
        min = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        int[] entry = new int[] {val, min};
        stack.push(entry);
        min = Math.min(min, val);
    }
    
    public void pop() {
        min = stack.pop()[1];
    }
    
    public int top() {
        return stack.peek()[0];
    }
    
    public int getMin() {
        return min;
    }
}
