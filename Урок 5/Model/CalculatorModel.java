package Model;

import java.util.*;

public class CalculatorModel implements ICalculatorModel {

    private String infixToPostfix(String infix) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < infix.length(); i++) {
            char c = infix.charAt(i);

            if (Character.isDigit(c) || c == '.') {
                postfix.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(' ').append(stack.pop());
                }
                stack.pop();
            } else {
                if (c == '-' && (i == 0 || !Character.isDigit(infix.charAt(i - 1)))
                        && Character.isDigit(infix.charAt(i + 1))) {
                    postfix.append(c);
                    continue;
                }
                while (!stack.isEmpty() && getPriority(c) <= getPriority(stack.peek())) {
                    postfix.append(' ').append(stack.pop());
                }
                postfix.append(' ');
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            postfix.append(' ').append(stack.pop());
        }

        return postfix.toString();
    }

    private int getPriority(char operator) {
        switch (operator) {
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

    private double calculatePostfix(String postfix) {
        Stack<Double> stack = new Stack<>();
        StringTokenizer tokenizer = new StringTokenizer(postfix);

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();

            if (isNumeric(token)) {
                stack.push(Double.parseDouble(token));
            } else {
                double b = stack.pop();
                double a = stack.pop();

                switch (token.charAt(0)) {
                    case '+':
                        stack.push(a + b);
                        break;
                    case '-':
                        stack.push(a - b);
                        break;
                    case '*':
                        stack.push(a * b);
                        break;
                    case '/':
                        stack.push(a / b);
                        break;
                    case '^':
                        stack.push(Math.pow(a, b));
                        break;
                }
            }
        }

        return stack.pop();
    }

    private boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    @Override
    public Double compute(String expression) {
        return calculatePostfix(infixToPostfix(expression));
    }
}