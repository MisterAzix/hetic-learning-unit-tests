package org.hetic;

public class Calculator {
    public int processArgs(String[] args) {
        if (args.length != 3) {
            throw new IllegalArgumentException("You must provide 3 arguments: two numbers and an operator (<number> <number> <operator>)");
        }

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        String operator = args[2];

        return calculate(a, b, operator);
    }

    private int calculate(int a, int b, String operator) throws IllegalArgumentException {
        int result = 0;

        switch (operator) {
            case "+":
                result = add(a, b);
                break;
            case "-":
                result = substract(a, b);
                break;
            case "*":
                result = multiply(a, b);
                break;
            default:
                throw new IllegalArgumentException("Invalid operator");
        }

        return result;
    }

    private int add(int a, int b) {
        return a + b;
    }

    private int substract(int a, int b) {
        return a - b;
    }

    private int multiply(int a, int b) {
        return a * b;
    }
}
