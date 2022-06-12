class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                try {
                    Character last = stack.peek();
                    switch (last) {
                        case '(':
                            if (ch == ')') {
                                stack.pop();
                            } else {
                                return false;
                            }
                            break;
                        case '[':
                            if (ch == ']') {
                                stack.pop();
                            } else {
                                return false;
                            }
                            break;
                        case '{':
                            if (ch == '}') {
                                stack.pop();
                            } else {
                                return false;
                            }
                            break;
                    }

                } catch (Exception e) {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}