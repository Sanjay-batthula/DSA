
## Infix to Postfix Conversion
```
import java.util.Stack;

public class InfixToPostfix {
    public static String convertPostFixExpression(String infixExpression) {
        final String METHOD_NAME = "convertPostFixExpression";
        System.out.println("Method Invoked: " + METHOD_NAME + " | Expression: " + infixExpression);

        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0;  i < infixExpression.length(); i++) {
            char ch = infixExpression.charAt(i);

            // If operand, add it to result
            if (Character.isLetterOrDigit(ch)) {
                result.append(ch);
            }
            // If '(', push to stack
            else if (ch == '(') {
                stack.push(ch);
            }
            // If ')', pop until '('
            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                }
            }
            // Operator encountered
            else {
                while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        // Pop remaining operators
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.toString();
    }

    private static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public static void main(String[] args) {
        String infix = "A*(B+C)/D";
        System.out.println("Postfix: " + convertPostFixExpression(infix));
    }
}
```