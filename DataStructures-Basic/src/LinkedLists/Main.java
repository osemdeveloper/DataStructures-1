package LinkedLists;

import java.util.Stack;

class ExpressionNode {
    String value;
    ExpressionNode next;

    public ExpressionNode(String value) {
        this.value = value;
        this.next = null;
    }
}

class ExpressionList {
    ExpressionNode head;

    public void insert(String value) {
        ExpressionNode newNode = new ExpressionNode(value);

        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public int evaluatePostfix() {
        Stack<Integer> stack = new Stack<>();

        ExpressionNode current = head;
        while (current != null) {
            if (isNumeric(current.value)) {
                stack.push(Integer.parseInt(current.value));
            } else {
                int operand2 = stack.pop();
                int operand1 = stack.pop();

                int result;
                switch (current.value) {
                    case "+":
                        result = operand1 + operand2;
                        break;
                    case "-":
                        result = operand1 - operand2;
                        break;
                    case "*":
                        result = operand1 * operand2;
                        break;
                    case "/":
                        result = operand1 / operand2;
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid expression");
                }
                stack.push(result);
            }
            current = current.next;
        }

        return stack.pop();
    }

    private boolean isNumeric(String str) {
        return str.matches("-?\\d+");
    }
}

public class Main {
    public static void main(String[] args) {
        ExpressionList expressionList = new ExpressionList();
        
        // Inserting expressions in postfix notation
        expressionList.insert("5");
        expressionList.insert("7");
        expressionList.insert("2");
        expressionList.insert("*");
        expressionList.insert("+");
        
        // Evaluating and printing the result
        int result = expressionList.evaluatePostfix();
        System.out.println("Result: " + result); // Output: Result: 19
    }
}

