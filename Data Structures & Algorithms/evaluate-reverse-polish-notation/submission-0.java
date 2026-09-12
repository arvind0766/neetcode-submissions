class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            if (isInteger(tokens[i])) {
                stack.push(Integer.parseInt(tokens[i]));
            } else {
                int second = stack.pop();
                int first = stack.pop();
                stack.push(applyOperation(first, second, tokens[i]));
            }
        }
        return stack.pop();
    }

    private int applyOperation(int first, int second, String operator) {
        switch (operator) {
            case "+":
                return first + second;
            case "-":
                return first - second;
            case "/":
                return first / second;
            case "*":
                return first * second;
        }
        return 0;
    }

    private boolean isInteger(String str) {
        return str.matches("[-+]?\\d+");
    }
}
