class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] sol = new int[temperatures.length];
        Stack<int[]> stack = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {
            int temperature = temperatures[i];
            
            while (!stack.isEmpty() && stack.peek()[1] < temperature) {
                int[] popped = stack.pop();
                sol[popped[0]] = i - popped[0];
            }
            
            stack.push(new int[]{i, temperature});
        }

        while (!stack.isEmpty()) {
            sol[stack.pop()[0]] = 0;
        }

        return sol;
    }
}