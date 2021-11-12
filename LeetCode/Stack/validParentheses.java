class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{')
                stack.push(c);
            else {
                if(stack.isEmpty()) return false;
                char ch = stack.pop(); 
                if((c == ')' && ch == '(') ||  (c == ']' && ch == '[') || (c == '}' && ch == '{')) continue;
                else return false;
            }
        }
        return stack.isEmpty();
    }
}