```
import java.util.Stack;

public class PostfixEvaluator {

    private static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

    private static int performOperation(int operand1, int operand2, char operator) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                if (operand2 == 0)
                    throw new UnsupportedOperationException("Cannot divide by zero");
                return operand1 / operand2;
            case '^':
                return (int) Math.pow(operand1, operand2);
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }

    public static int evaluatePostFixExpression(String postfixExpression) {
        Stack<Integer> stack = new Stack<>();
        int output = 0;
        for (int i = 0; i < postfixExpression.length(); i++) {
            char ch = postfixExpression.charAt(i);

            if (Character.isDigit(ch)) {
                stack.push(ch - '0'); // convert char digit to int
            } else if (isOperator(ch)) {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                int result = performOperation(operand1, operand2, ch);
                stack.push(result);
            }
        }
        System.out.println(stack);
        output=stack.peek();
        System.out.println(output);

        return stack.pop();
    }

    public static void main(String[] args) {
        String postfix = "23*54*+9-"; // example: (2*3)+(5*4)-9
        System.out.println("Postfix Evaluation Result: " + evaluatePostFixExpression(postfix));
    }
}
```


