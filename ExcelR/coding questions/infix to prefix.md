
## Infix to Prefix

```
import java.util.Stack;

public class InfixToPrefix {
    public static String convertPrefixExpression(String infixExpression) {
        final String METHOD_NAME = "convertPrefixExpression";
        System.out.println("Method Invoked: " + METHOD_NAME + " | Expression: " + infixExpression);

        StringBuilder reversed = new StringBuilder(infixExpression).reverse();
        for (int i = 0; i < reversed.length(); i++) {
            char ch = reversed.charAt(i);
            if (ch == '(') {
                reversed.setCharAt(i, ')');
            } else if (ch == ')') {
                reversed.setCharAt(i, '(');
            }
        }

        String postfix = convertPostFixExpression(reversed.toString());
        String prefix = new StringBuilder(postfix).reverse().toString();
        return prefix;
    }

    private static String convertPostFixExpression(String infixExpression) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < infixExpression.length(); i++) {
            char ch = infixExpression.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                result.append(ch);
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(ch);
            }
        }

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
        System.out.println("Prefix: " + convertPrefixExpression(infix));
    }
}

```