class Solution {
    public String simplifyPath(String path) {
 
        Stack<String> stack = new Stack<>();
        for (String s : path.split("/")) {
            if (s.equals("..")) {
                if (!stack.isEmpty()) stack.pop();

            } else if (!s.isEmpty() && !s.equals(".")) {
                stack.push(s);
            }
        }

        return "/" + String.join("/", stack);
    }
}