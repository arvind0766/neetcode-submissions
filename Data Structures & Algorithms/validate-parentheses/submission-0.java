class Solution {
    public boolean isValid(String s) {
         Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            if (isOpenParenthesis(ch)) {
                stack.push(ch);
            } else {
                if(stack.isEmpty()) return false;
                Character last = stack.pop();
                if (!isCorrectParenthesis(ch, last))
                    return false;
            }
        }
        return stack.isEmpty();
    }

      private boolean isOpenParenthesis(char ch) {
        return ch == '(' || ch == '{' || ch == '[';
    }

    private boolean isCorrectParenthesis(char close, char open) {
        if (close == ')')
            return open == '(';
        if (close == '}')
            return open == '{';
        if (close == ']')
            return open == '[';
        return false;
    }
}
