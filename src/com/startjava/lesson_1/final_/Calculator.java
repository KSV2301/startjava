package com.startjava.lesson_1.final_;

public class Calculator {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 10;
        char operation = '^';
        int result = 0;

        if (operation == '+') {
            result = num1 + num2;
        } else if (operation == '-') {
            result = num1 - num2;
        } else if (operation == '*') {
            result = num1 * num2;
        } else if (operation == '/') {
            result = num1 / num2;
        } else if (operation == '^') {
            result = 1;
            for (int i = 0; i < num2; i++) {
                result *= num1;
            }
        } else if (operation == '%') {
            result = num1 % num2;
        }
        
        System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
    }
}