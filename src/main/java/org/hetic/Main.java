package org.hetic;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.processArgs(args);
        System.out.println("Result: " + result);
    }
}