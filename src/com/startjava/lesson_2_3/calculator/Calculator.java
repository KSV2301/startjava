package com.startjava.lesson_2_3.calculator;

public class Calculator {
    private int number1;
    private int number2;
    private char operation;

    public void setNumber1(int number1) { 
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public void setOperation(char operation) {
        switch (operation) {
            case '+':
            case '-':
            case '*':
            case '/':
            case '^':
            case '%':
                this.operation = operation;
                break;
            default:
                System.out.println("\nОшибка: операция '" + operation + "' не поддерживается\n");
        }
    }

    public char getOperation() {
        return operation;
    }

    public double calculate() {
        switch (operation) {
            case '+':
                return number1 + number2;
            case '-':
                return number1 - number2;
            case '*':
                return number1 * number2;
            case '/':
                return divide();
            case '%':
                return modulo();
            case '^':
                return Math.pow(number1, number2);
        }
        return 0.0;
    }

    public double divide() {
        if (number2 == 0) {
            System.out.println("\nОшибка: деление на ноль запрещено");
            return 0.0;
        }
        return (double) number1 / number2;
    }

    public double modulo() {
        if (number2 == 0) {
            System.out.println("\nОшибка: деление на ноль запрещено");
            return 0.0;
        }
        return number1 % number2;
    }
}