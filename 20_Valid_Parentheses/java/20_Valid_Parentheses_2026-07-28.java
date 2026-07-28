class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            switch(c) {
                case '(':
                case '[':
                case '{':
                    stack.push(c);
                    break;
                case ')':
                    char compare = stack.pop();
                    if (compare != '(') {
                        return false;
                    }
                    break;
                case ']':
                    compare = stack.pop();
                    if (compare != '[') {
                        return false;
                    }
                    break;
                case '}':
                    compare = stack.pop();
                    if (compare != '{') {
                        return false;
                    }
                    break;
            }

        }

        return true;
    }
}